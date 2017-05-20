(ns medalator.ownrec.image
  (:require [mikera.image.core :as im]
            [mikera.image.colours :as col]
            [mikera.image.filters :as fil]
            [mikera.image.spectrum :as spe])
  (:import [java.awt.image BufferedImage]))

(defn load-img [res] (im/load-image res))

(defn all-pixels-matr [^BufferedImage img] (partition (.getWidth img)
                                  (map (fn [x] [(bit-shift-right (bit-and x 0xff0000) 16)
                                                (bit-shift-right (bit-and x 0xff00) 8) (bit-and x 0xff)])
                                       (seq (im/get-pixels img)))))
(def apix all-pixels-matr)
(defn seq-of-seqs-to-vec-of-vecs [s] (vec (map vec s)))
(def matr seq-of-seqs-to-vec-of-vecs)

(defn where-menu-arrow-ends [matr]
  (->> matr
       (take 300)
       (map #(take 3 %))
       (keep-indexed (fn [i x] (when (every? #(>= 100 (last %)) x) i)))
       first))

(defn where-is-lvl-req [matr]
  (let [dropped (where-menu-arrow-ends matr)
        resu (->> matr
                  (take 600)
                  (drop dropped)
                  (map #(take 3 %))
                  (keep-indexed (fn [i x] (when (every? #(<= 50 (last %)) x) i)))
                  ;;(iterate #(if (= (inc (first %)) (second %))
                  ;;            (cons (first %) (drop 2 %))))
                  ;;(iterate #(if (= (inc (second %)) (nth % 3))
                  ;;            (cons (first %) (cons ()))))))
                  )]
    (->> (cons (first resu)
               (loop [end (first resu)
                      resu (rest resu)]
                 (if (= (inc end) (first resu))
                   (recur (inc end) (rest resu))
                   [end (first resu)
                    (loop [end (second resu)
                           resu (drop 2 resu)]
                      (if (= (inc end) (first resu))
                        (recur (inc end) (rest resu)) end))])))
         (map (partial + dropped))
         (partition 2) (map vec) vec)))

(defn where-headers-start [matr]
  (let [dropped (inc (second (second (where-is-lvl-req matr))))]
    (->> matr
         (drop dropped)
         (map first) (map first) (map pos?)
         (keep-indexed #(when %2 %1))
         first (+ (dec dropped)))))

(defn pos-red-from-to [taken dropped matr]
  (->> matr
       (take taken)
       (drop dropped)
       (map #(map (comp pos? first) %))))

(defn indices-pos-red-from-to [taken dropped matr]
  (->> matr
       (pos-red-from-to taken dropped)
       (map (fn [x] (keep-indexed #(when %2 %1) x)))))

(defn margins-border-pos-red-from-to [taken dropped matr]
  (->> matr
       (indices-pos-red-from-to taken dropped)
       (map #(vector (first %) (last %)))))

(defn call-on-medals-and-missions [what matr]
  (what (where-headers-start matr) (-> matr where-is-lvl-req second second inc) matr))

(defn slashes-sample [matr]
  (->> matr
       (drop (second (second (where-is-lvl-req matr))))
       (take 50)
       (map #(take 50 %))))

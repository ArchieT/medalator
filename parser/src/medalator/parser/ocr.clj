(ns medalator.parser.ocr
  (:require [clojure.java.shell :refer [sh]]
            [clojure.string :as str]))

(defn ocrad-run [pnm-path]
  (sh "sh" "-c" (str/join ["ocrad -i --scale=-1 " pnm-path])))

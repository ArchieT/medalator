(ns medalator.parser.parse
  (:require [clojure.string :as str]
            [medalator.parser.origstrs :as o]))


(defn ocrad-out-process [what]
  (-> what
      str/split-lines
      ))

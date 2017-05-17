(ns medalator.parser.ocr
  (:require [clojure.java.shell :refer [sh]]))

(defn ocrad-run [path]
  (sh "ocrad" "-i --scale=-1" path))

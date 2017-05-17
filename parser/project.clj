(defproject medalator/parser "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]
                 [prismatic/schema "1.1.5"]
                 [org.clojure/test.check "0.9.0"]]
  :plugins [[lein-bikeshed "0.2.0"]
            [lein-cljfmt "0.5.6"]
            [lein-kibit "0.1.3"]]
  :source-paths ["src"]
  :test-paths ["test"])

(defproject medalator "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]
                 [medalator/parser "0.1.0-SNAPSHOT"]]
  :plugins [[lein-sub "0.3.0"]
            [lein-bikeshed "0.2.0"]
            [lein-cljfmt "0.5.6"]
            [lein-kibit "0.1.3"]]
  :sub ["parser"])

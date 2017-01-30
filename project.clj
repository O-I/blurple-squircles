(defproject blurple-squircles "0.1.0-SNAPSHOT"
  :description "Blurple Squircles"
  :url "http://blurplesquircles.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.5.1"]
                 [compojure "1.5.2"]]
  :min-lein-version "2.0.0"
  :uberjar-name "blurple-squircles.jar"
  :main blurple-squircles.core
  :profiles {:dev
             {:main blurple-squircles.core/-dev-main}})

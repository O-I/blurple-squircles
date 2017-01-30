(defproject blurple-squircles "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.5.1"]
                 [compojure "1.5.2"]]
  :main blurple-squircles.core
  :profiles {:dev
             {:main blurple-squircles.core/-dev-main}})

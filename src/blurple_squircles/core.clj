(ns blurple-squircles.core
  (:require [ring.adapter.jetty :as jetty]))

(defn -main [port]
  (jetty/run-jetty (fn [req]
                     {:status 200
                      :body "Blurple Squircles"
                      :headers {}})
                   {:port (Integer. port)}))

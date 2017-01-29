(ns blurple-squircles.core
  (:require [ring.adapter.jetty :as jetty]))

(defn status [req]
  {:status 200
   :body "Blurple Squircles"
   :headers {}})

(defn -main [port]
  (jetty/run-jetty status
                   {:port (Integer. port)}))

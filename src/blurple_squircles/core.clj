(ns blurple-squircles.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]))

(defn status [{:keys [uri] :as req}]
  (if (= uri "/")
    {:status 200
     :body "Blurple Squircles"
     :headers {}}
    {:status 404
     :body "Shape and/or color not found"
     :headers {}}))

(defn -main [port]
  (jetty/run-jetty status
                   {:port (Integer. port)}))

(defn -dev-main [port]
  (jetty/run-jetty (wrap-reload #'status)
                   {:port (Integer. port)}))
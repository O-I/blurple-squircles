(ns blurple-squircles.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found]]))

(defn status [{:keys [uri] :as req}]
  {:status 200
   :body "Blurple Squircles"
   :headers {}})

(defroutes app
  (GET "/" [] status)
  (not-found "Shape and/or color not found"))

(defn -main [port]
  (jetty/run-jetty status
                   {:port (Integer. port)}))

(defn -dev-main [port]
  (jetty/run-jetty (wrap-reload #'app)
                   {:port (Integer. port)}))
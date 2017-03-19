(ns blurple-squircles.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found resources]]
            [blurple-squircles.views :refer [origin]]))

(defroutes app
  (GET "/" [] (origin))
  (resources "/")
  (not-found "Shape and/or color not found"))

(defn -main [port]
  (jetty/run-jetty app
                   {:port (Integer. port)}))

(defn -dev-main [port]
  (jetty/run-jetty (wrap-reload #'app)
                   {:port (Integer. port)}))
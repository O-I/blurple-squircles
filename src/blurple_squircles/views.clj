(ns blurple-squircles.views
  (:require [hiccup.page :refer [html5 include-css]]))

(def svg-dimensions
  {:width  200
   :height 200})

(def blurple-hexcode
  "#5527EC")

(def squircle-path
  {:id "squircle"
   :d  "M 100,   0
        C  20,   0   0,  20   0, 100
            0, 180  20, 200 100, 200
          180, 200 200, 180 200, 100
          200,  20 180,   0 100,   0 Z"})

(def svg-use-attributes
  {"xlink:href" "#squircle"
   :fill blurple-hexcode})

(def svg
  [:svg svg-dimensions
   [:defs
    [:path squircle-path]]
   [:use svg-use-attributes]])

(def blurple-squircle
  [:div#blurple-squircle svg])

(defn origin []
  (html5
   [:head
    [:title "Blurple Squircles"]
    (include-css "/css/style.css")]
   [:body blurple-squircle]))
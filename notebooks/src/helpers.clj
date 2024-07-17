(ns src.helpers
  (:require [scicloj.kindly.v4.api :as kindly] 
            [scicloj.kindly.v4.kind :as kind]
            [clojure.string :as str]))

(def md
  (fn [file-name]
    (let [markdown (comp kindly/hide-code kind/md)]
      (markdown (slurp (str "content/" file-name))))))

(defn- external-img [file-name]
  (let [image (comp kindly/hide-code kind/hiccup)]
    (image [:img {:src file-name
                  :style "width: 100%;"}])))


(defn- local-image [file-name]
  (let [image (comp kindly/hide-code kind/hiccup)]
    (image [:img {:src (str "notebooks/images/" file-name)
                  :style "width: 100%;"}])))

(defn img [file-name]
  (if (str/starts-with? file-name "https://")
    (external-img file-name)
    (local-image file-name)))

(ns src.helpers
  (:require [scicloj.kindly.v4.api :as kindly]
            [scicloj.kindly.v4.kind :as kind]))

(def md
  (fn [file-name]
    (let [markdown (comp kindly/hide-code kind/md)]
      (markdown (slurp (str "content/" file-name))))))

(defn img [file-name]
  (let [image (comp kindly/hide-code kind/hiccup)]
    (image [:img {:src (str "notebooks/images/" file-name)
                  :style "width: 100%;"}])))

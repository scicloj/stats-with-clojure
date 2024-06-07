(ns dev
  (:require [scicloj.clay.v2.api :as clay]))

(clay/make! {:format [:quarto :html]
             :base-source-path "notebooks"
             :source-path (->> "notebooks/chapters.edn"
                               slurp
                               clojure.edn/read-string
                               (map #(format "stats_with_clojure/%s.clj" %))
                               (cons "index.clj"))
             :base-target-path "docs"
             :book {:title "Stats With Clojure"}
             :clean-up-target-dir true})


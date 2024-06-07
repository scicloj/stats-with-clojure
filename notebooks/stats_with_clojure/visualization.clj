;; # Visualization

^:kindly/hide-code
(ns stats-with-clojure.visualization
  (:require [scicloj.kindly.v4.api :as kindly]
            [scicloj.kindly.v4.kind :as kind]))

^:kindly/hide-code
(def md
  (comp kindly/hide-code kind/md))

(md (slurp "content/london_cholera_outbreak.md"))

(md (slurp "content/napoleons_invasion_of_russia.md"))


;; # Bibliography

^:kindly/hide-code
(ns stats-with-clojure.bibliography
  (:require [scicloj.kindly.v4.api :as kindly]
            [scicloj.kindly.v4.kind :as kind]))

^:kindly/hide-code
(def md
  (comp kindly/hide-code kind/md))

(md (slurp "content/bibliography.md"))

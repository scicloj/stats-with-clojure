;; # Analysis of roll of dice

^:kindly/hide-code
(ns stats-with-clojure.dice
  (:require [src.helpers :as h]))

(def faces (range 1 7))

faces

(def combinations
  (for [x faces y faces] [x y]))

combinations

(map #(apply + %) combinations)

(frequencies (map #(apply + %) combinations))

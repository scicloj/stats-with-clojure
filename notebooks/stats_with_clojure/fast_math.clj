;; # Fast Math

(ns stats-with-clojure.fast-math
  (:require
   [scicloj.kindly.v4.api :as kindly]
   [scicloj.kindly.v4.kind :as kind]
   [fastmath.core :as fc]))

^:kindly/hide-code
(def md
  (comp kindly/hide-code kind/md))

;; ## What is Fast Math?

;; <https://github.com/generateme/fastmath>

;; why use it?

;; speed

;; tested libraries

;; constants

;; trig functions


(fc/abs -1)

(fc/sqrt 9)

(fc/sin 0.5)

(fc/sin (/ fc/PI 2))

(fc/exp 1)

(fc/exp 5)

(fc/log 10)

(fc/log fc/E)


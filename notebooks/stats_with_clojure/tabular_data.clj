;; # Tabular Data

^:kindly/hide-code
(ns stats-with-clojure.tabular-data
  (:require [scicloj.kindly.v4.api :as kindly]
            [scicloj.kindly.v4.kind :as kind]
            [tablecloth.api :as tc]))


^:kindly/hide-code
(def md
  (comp kindly/hide-code kind/md))

;; ## Table Cloth

(require '[tablecloth.api :as tc]
         '[tech.v3.datatype.functional :as dfn])


;; ## The iris data set

;; <https://gist.github.com/curran/a08a1080b88344b0c8a7/>

(defonce iris (tc/dataset
               "https://gist.githubusercontent.com/curran/a08a1080b88344b0c8a7/raw/0e7a9b0a5d22642a06d3d5b9bcbad9890c8ee534/iris.csv"))

iris

(tc/columns iris)

(tc/column iris "species")

(set (tc/column iris "species"))

;; <https://github.com/scicloj/tablecloth/>

;; <https://scicloj.github.io/tablecloth/>


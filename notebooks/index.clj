^:kindly/hide-code
(ns index
  (:require [scicloj.kindly.v4.api :as kindly]
            [scicloj.kindly.v4.kind :as kind]
            [clojure.string :as str]
            [clojure.string :as string]
            [scicloj.clay.v2.api :as clay]
            [src.helpers :as h]))

^:kindly/hide-code
(def md
  (comp kindly/hide-code kind/md))

(h/img "stats_with_clojure_front_cover.svg")

;; ## Preface

(h/md "stats_with_clojure.md")

;; ## Chapters

^:kindly/hide-code
(defn chapter->title [chapter]
  (or (some->> chapter
               (format "notebooks/stats_with_clojure/%s.clj")
               slurp
               str/split-lines
               (filter #(re-matches #"^;; # .*" %))
               first
               (#(str/replace % #"^;; # " "")))
      chapter))

(->> "notebooks/chapters.edn"
     slurp
     clojure.edn/read-string
     (map (fn [chapter]
            (prn [chapter (chapter->title chapter)])
            (format "\n- [%s](stats_with_clojure.%s.html)\n"
                    (chapter->title chapter)
                    chapter)))
     (string/join "\n")
     md)


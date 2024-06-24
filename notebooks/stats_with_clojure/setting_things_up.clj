;; # Setting Things Up

^:kindly/hide-code
(ns stats-with-clojure.setting-things-up)

^:kindly/hide-code
(ns stats-with-clojure.setting-things-up
  (:require
   [scicloj.kindly.v4.api :as kindly]
   [scicloj.kindly.v4.kind :as kind]))

^:kindly/hide-code
(def md
  (comp kindly/hide-code kind/md))


(md (slurp "content/setting_things_up.md"))

;; ## Running this book

;; Have REPl running

;; custom REPL commands

;; quarto

;; REPL

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

^:kindly/hide-code
(defn img [file-name]
  (kind/hiccup
   [:img {:src (str "notebooks/images/" file-name)
         :style "width: 100%;"}]))


(md (slurp "content/setting_things_up.md"))

;; ## Running this book

;; Have REPl running

;; custom REPL commands

^:kindly/hide-code
(img "custom_repl_command_in_vscodium.png")

;; quarto

^:kindly/hide-code
(img "create_html_using_quarto.png")

;; code and HTML side by side

^:kindly/hide-code
(img "executing_notebook_with_quarto.png")

;; REPL

^:kindly/hide-code
(img "executing_in_repl.png")

;; # Analysis of roll of dice

^:kindly/hide-code
(ns stats-with-clojure.dice
  (:require [src.helpers :as h]))

;; ![](https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Schaumstoffw%C3%BCrfel.jpg/608px-Schaumstoffw%C3%BCrfel.jpg)

;; In this chapter let's analyze the roll of pair of dice, and see what odds of betting will make you win. For that let's define a variable named `faces`, that holds a range of numbers from 1 to 6. 

(def faces (range 1 7))

faces

;; Now let's generate combinations of die throws. So in the code below `x` and `y` are variables that hold the numbers from 1 to 6. The `for` function generates a list of vectors containing all possible combinations of `x` and `y`.

(def combinations
  (for [x faces y faces] [x y]))

combinations

;; Now let's sum up those combinations:

(map #(apply + %) combinations)


;; Let's use `frequencies` to see which number comes up most often when summed up:

(def frequency-of-sums (frequencies (map #(apply + %) combinations)))

frequency-of-sums

;; Now let's sort `frequency-of-sums` by its values:

(sort-by val > frequency-of-sums)

;; Looks like when a pair of dice is thrown, number 7 comes up most often, followed by 6, 8, and 9. So better bet on number 7 when you throw a pair of dice.

;; ## Plotting

;; TBD
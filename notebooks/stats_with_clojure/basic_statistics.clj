;; # Basic Statistics

^:kindly/hide-code
(ns stats-with-clojure.basic-statistics
  (:require [scicloj.kindly.v4.api :as kindly]
            [scicloj.kindly.v4.kind :as kind]))

^:kindly/hide-code
(def md
  (comp kindly/hide-code kind/md))


;; ## Total

;; $$
;; \sum_{i=1}^n x_i
;; $$

(def marks [70 80 60 90])

(apply + marks)


(defn total [vector]
  (apply + vector))


(total marks)

;; ## Mean

(defn mean [vector]
  (/ (total vector) (count vector)))


(mean marks)

;; ## Median

(defn median_odd [vector]
  (nth vector (/ (count vector) 2)))


(median_odd marks)


(defn median_even [vector]
  (let [middle-idx (/ (count vector) 2)]
    (/ (+ (nth vector middle-idx) (nth vector (dec middle-idx))) 2)))


(median_even marks)


(defn median [vector]
  (if (even? (count vector))
    (median_even vector)
    (median_odd vector)))


(median marks)


;; ## Mode

(defn mode [vector]
  (->> vector
       frequencies
       (sort-by second >)
       first
       first))


(mode marks)

;; ## Range

(defn range [vector]
  (- (apply max vector) (apply min vector)))


(range marks)

;; ## Percentiles

(defn percentile [vector percentile]
  (let [sorted-vector (sort vector)
        idx (int (* percentile (/ (count sorted-vector) 100)))]
    (nth sorted-vector idx)))

(percentile marks 60)

(percentile marks 90)

;; ## Quartiles



;; ## Interquartile Range

;; ## Variance

(defn variance [vector]
  (let [m (mean vector)]
    (apply + (map #(* % %) (map #(- % m) vector)))))

(variance marks)

;; ## Standard Deviation

(defn standard-deviation [vector]
  (Math/sqrt (variance vector)))

(standard-deviation marks)

;; ## Covariance

;; ## Correlation


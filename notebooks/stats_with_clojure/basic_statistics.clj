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
;; total = \sum_{i=1}^n x_i
;; $$

(def marks [70 80 60 90])

(apply + marks)


(defn total [vector]
  (apply + vector))


(total marks)

;; ## Mean

;; $$
;; mean = \frac{total}{n}
;; $$

;; $$
;; mean = \frac{1}{n} \sum_{i=1}^n x_i
;; $$

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

(defn stats-range [vector]
  (- (apply max vector) (apply min vector)))


(stats-range marks)

;; ## Percentiles

(defn percentile [vector percentile]
  (let [sorted-vector (sort vector)
        idx (int (* percentile (/ (count sorted-vector) 100)))]
    (nth sorted-vector idx)))

(percentile marks 60)

(percentile marks 90)

;; ## Quartiles

(def one-to-forty (range 1 41))

(defn first-quartile [vector]
  (percentile vector 25))

(first-quartile one-to-forty)

(defn second-quartile [vector]
  (percentile vector 50))

(second-quartile one-to-forty)

(defn third-quartile [vector]
  (percentile vector 75))

(third-quartile one-to-forty)

(defn quartiles [vector]
  [(first-quartile vector) (second-quartile vector) (third-quartile vector)])


(quartiles one-to-forty)



;; ## Interquartile Range

(defn interquartile-range [vector]
  (- (third-quartile vector) (first-quartile vector)))


(interquartile-range one-to-forty)

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


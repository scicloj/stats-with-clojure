;; # Visualization

^:kindly/hide-code
(ns stats-with-clojure.visualization
  (:require [src.helpers :as h]))

(h/md "a_word_about_visualization.md")

;; ## London Cholera Outbreak

;; <https://en.wikipedia.org/wiki/1854_Broad_Street_cholera_outbreak>

;; It was 1854, and London had a cholera outbreak. None knew how one contracted cholera, and it was thought smelling foul things made you sick. The death tolls were rising and something must be done about it. 

;; A person named John Snow, pictured below, used visualization techniques to find the source of this disease.

;; ![](https://upload.wikimedia.org/wikipedia/commons/a/a4/Barker--John_Snow--1847.jpg)

;; Take look at the map below:

;; ![](https://upload.wikimedia.org/wikipedia/commons/2/27/Snow-cholera-map-1.jpg)

;; If you zoom in, you can see some black bars. Each bar is a dead person due to cholera.

(h/img "cholera_deaths.png")

;; If you see the picture above, you can notice that around a certain pump, there are more deaths. John Snow inferred that Cholera spreads due to contaminated water, and this particular pump was very much contaminated.

;; ![](https://upload.wikimedia.org/wikipedia/commons/c/cd/Pump_Handle_-_John_Snow_.jpg)

;; To prevent the spread of this disease, he removed the handle of this pump, and cholera deaths decreased. Till this day, the pump whose handle bar is removed stands in London. There is bar nearby that bears the name of John Show.


(h/md "napoleons_invasion_of_russia.md")

(h/md "florence_nightingale.md")

;; ## Hans Rosling's analysis of countries GDP

;; <https://www.youtube.com/watch?v=jbkSRLYSojo>


(ns index
  (:require [scicloj.kindly.v4.kind :as kind]
            [scicloj.kindly.v4.api :as kindly]))

^:kindly/hide-code
(def md
  (comp kindly/hide-code kind/md))

(md "
- Initial setup
- Basic Stats
  - fastmath
  - Sum
  - Mean
  - Median
  - Mode
  - Range
  - Inter Quartile Range
  - Outlier
  - Standard Deviation
- Data Collection
  - Webscrapping
  - Data Scources
  - Surveys
  - Bias
  - Double Blind Experiments
- Data Wrangling
  - Tablecloth
- Visualisations
  - Scatter Plots
  - Line Plots
  - Bar Plots
  - Pie Plots
  - Area Plots
  - Box Plots
  - Histograms
  - Bubble Plots
  - Heatmaps
- Bibliography
"
)

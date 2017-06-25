(ns proficiency.math.herons_formula
  (:require [clojure.math.numeric-tower :as math]))

(defn semiperimeter [a b c]
  (/ (+ a b c) 2))

(defn area-of-triangle [a b c]
  (def s (semiperimeter a b c))
  (math/sqrt (* s (- s a) (- s b) (- s c))))

(let [[a b c] (map #(Integer. %) *command-line-args*)]
  (println (area-of-triangle a b c)))

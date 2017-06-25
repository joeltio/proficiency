(ns proficiency.math
  (:gen-class)
  (:require [clojure.math.numeric-tower :as math]))

(defn prime_checker [n]
  (cond
    (< n 2) false
    (= n 2) true
    (even? n) false
    (not-any? #(= (mod n %) 0) (range 3 (math/sqrt n) 2)) false
    :else true))

(defn -main
  [& args]
  (def n (Integer. (first args)))
  (println (prime_checker n)))

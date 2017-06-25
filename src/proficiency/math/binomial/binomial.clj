(ns proficiency.math.binomial)

(defn factorial [n]
  (apply * (range 1 (inc n))))

(defn choose [n k]
  (/ (factorial n)
     (* (factorial k) (factorial (- n k)))))

(defn binomial-term [n k]
  (def coefficient (choose n k))
  (def a-exponent (- n k))
  (def b-exponent k)
  (format "%da^%db^%d" coefficient a-exponent b-exponent))

(defn binomial [n]
  (clojure.string/join " + " (map #(binomial-term n %) (range (inc n)))))

(def n (first *command-line-args*))
(println (binomial (Integer. n)))

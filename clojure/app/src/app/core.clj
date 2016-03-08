(ns app.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn fibo [x]
   (loop [sum 0 a 1 b 1]
   (if (> (+ a b) x)
   sum
   (recur (if (= 0 (mod (+ a b)  2)) (+ sum (+ a b)) sum) b (+ a b)))))


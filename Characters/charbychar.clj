(ns testingclojure.charbychar)

(defn charby []
  (def string1 (read-line))
  (def chararr (seq (char-array string1)))
  (println chararr)
  (loop [i 0]
    (when (< i 4)
    (println (get(set chararr)i))
    (recur (inc i)))))
(charby)
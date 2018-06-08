(ns testingclojure.uniquechar)

(defn uniquechar []
  (def string1 (read-line))
  (def chararr (seq (char-array string1)))
  (println(set chararr)))
(uniquechar)
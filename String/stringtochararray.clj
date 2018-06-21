(ns testingclojure.stringtochararray)

(defn chararray []
  (def string1 "satyamramawat")
  (def chararr (seq (char-array string1)))
  (println chararr))
(chararray)


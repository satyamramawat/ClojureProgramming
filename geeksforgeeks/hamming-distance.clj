;;Author - Satyam Ramawat
;; Find out the hamming distance of two numbers

(ns geeksforgeeks.core)

(def one_byte 8)
(defn convert-to-binary
  "Function to convert number into binary"
  [number]
  (def binary-vector [])
  (def temp_number number)
  (loop [z 0]                                                     
    (when (< z one_byte)
      (def binary-vector (conj binary-vector (rem temp_number 2)))
      (def temp_number (quot temp_number 2))
      (recur(inc z))))
  binary-vector )

(defn hamming-distance []
  (def first_number (convert-to-binary 219))
  (println first_number)
  (def second_number (convert-to-binary 106))
  (println second_number)
  
  (def counter 0)
  (loop [start 0]
    (when (< start one_byte)
      (if (not= (get first_number start) (get second_number start))
        (def counter (+ counter 1)))
      (recur(inc start))))
  counter)

(hamming-distance)
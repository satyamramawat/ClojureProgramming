(ns testingclojure.palindrome)

(defn palin[]
 (def string1 (read-line))
 (def string2 (clojure.string/reverse string1))
 (if (= string1 string2)
   (println "Both Strings are palindrome")
   (println "Both are not palindrome")))
(palin)
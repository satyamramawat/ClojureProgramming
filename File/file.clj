(ns testingclojure.file)

(defn Example []
   (def newstr (read-line))  ;Reading Input from a user
   (spit "c:/users/sr062324/desktop/test.txt" newstr) ;Writing to a File
   (def string1 (slurp "c:/users/sr062324/desktop/test.txt")) ;Reading from a File
   (println string1))
(Example)
(ns testingclojure.stringcaseconversion)

(defn stringconv[]
  (def string1 (read-line))
  (println (clojure.string/upper-case string1))) ;Converted String Upper-Case
(stringconv)
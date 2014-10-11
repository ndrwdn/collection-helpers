(ns collection-helpers.maps)

(defmacro contains-entries?
  [expected-values actual-values]
  `(and
     ~@(map
         (fn [expected-value] `(some #(= ~expected-value %) ~actual-values))
         expected-values)))

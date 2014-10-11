(ns collection-helpers.maps-test
  (:require [clojure.test :refer :all]
            [collection-helpers.maps :refer :all]))

(deftest contains-entries?-tests
  (testing "should handle a single entry"
    (is (contains-entries? {:key :value} {:key :value})))

  (testing "should handle empty map"
    (is (not (contains-entries? {:key :value} {}))))

  (testing "should handle empty entries"
    (is (contains-entries? {} {})))

  (testing "should handle multiple entries"
    (is (contains-entries? {:key1 :value1 :key2 :value2} {:key1 :value1 :key2 :value2 :key3 :value3})))

  (testing "should require all values to be present"
    (is (not (contains-entries? {:key1 :value1 :key2 :value2} {:key2 :value2})))))

(ns pmp002-02.core
  (:gen-class))

(defn mysum [& rest] (apply + rest))

(defn -main []
  (println (mysum 1 3 5 78)))

  
  

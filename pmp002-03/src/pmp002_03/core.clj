(ns pmp002-03.core
  (:gen-class))

(defn -main []
  (let [runs (atom [])]
    (loop []
      (println "How long (minutes) did your run take?")
      (let [run (read-line)]
        (if-not (empty? run)
          (do
            (try 
              (swap! runs conj (Float/parseFloat run))
              (catch Exception e (println "Stick to numbers please...")))
            (recur)))))
    (println (format "Average of %.2f, on %d race(s)." 
                     (/ (apply + @runs) (count @runs))
                     (count @runs)))))

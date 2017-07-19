(ns pmp003_01.core
  (:gen-class))

(defn -main []
  (println "Please enter a word:")
  (let [word (read-line)
        char1 (first word)]
    (if (some #{char1} [\a \e \i \o \u])
      (println (str word "way"))
      (println (str (subs word 1) char1 "ay")))))

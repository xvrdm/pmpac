(ns pmp003_03.core
  (:gen-class))

(require '[clojure.string :as str])

(defn translate [letter]
  (if (some #{letter} [\a \e \i \o \u])
    (str "ub-" letter)
    (str letter)))

(defn -main []
  (println "Please enter a sentence:")
    (let [sentence (read-line)
          letters (seq sentence)]
      (println (str/join "" (map translate letters)))))

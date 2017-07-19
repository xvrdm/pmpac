(ns pmp003_02.core
  (:gen-class))

(require '[clojure.string :as str])

(defn translate [word]
  (let [char1 (first word)]
    (if (some #{char1} [\a \e \i \o \u])
      (str word "way")
      (str (subs word 1) char1 "ay"))))

(defn -main []
  (println "Please enter a sentence:")
    (let [sentence (read-line)
          words (str/split sentence #" ")]
      (println (str/join " " (map translate words)))))

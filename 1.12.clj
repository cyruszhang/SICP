#_ "Pascal's triangle, with recursive process"

(defn pascal [r c]
  (cond
    (= r c) 1
    (= c 1) 1
    :else (+ (pascal (- r 1) c) (pascal (- r 1) (- c 1)))))
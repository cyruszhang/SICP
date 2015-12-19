#_ "SICP Exercise 1.11"

(defn func [x]
  (if (< x 3)
    x
    (+ (func (- x 1)) (func (- x 2)) (func (- x 3)))))

(func 25)


(defn func2 [x]
  (letfn
    [(iter [a b c count]
           (if (= count 0)
             a
             (iter b c (+ a b c) (dec count))))]
  (iter 0 1 2 x)))

(func2 25)
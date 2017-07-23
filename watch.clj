(require 'cljs.build.api)

(cljs.build.api/watch "src"
                      {:main 'calculator.core
                       :output-to "out/main.js"})

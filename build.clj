(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'calculator.core
                       :output-to "out/main.js"})

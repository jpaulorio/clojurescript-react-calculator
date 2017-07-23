# clojurescript-react-calculator
## A simple calculator built with React and Clojurescript

# Setup

* Install JDK 8
* Install Clojure
* Install rlwrap - ```brew install rlwrap```

# Development

## Run the following command to build the app and start a Repl:

```rlwrap java -cp 'cljs.jar:lib/*:src' clojure.main repl.clj```

## Open the browser and point it to http://localhost:9000

## In the Repl, enter the following command to reload the app in the browser:

```(require '[calculator.core :as calc] :reload)```

# Build

## Run the following command to build the app:

```java -cp 'cljs.jar:lib/*:src' clojure.main build.clj```

# Release

## Run the following command to build the app for release:

```java -cp 'cljs.jar:lib/*:src' clojure.main release.clj```

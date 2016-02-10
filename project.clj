(defproject clj-bugsnag "0.2.6"
  :description "Fully fledged Bugsnag client. Supports ex-data and ring middleware."
  :url "https://github.com/wunderlist/clj-bugsnag"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.3.0"
  :dependencies [
    [org.clojure/clojure "1.6.0"]
    [clj-stacktrace "0.2.7"]
    [clj-http "2.0.0"]
    [environ "1.0.2"]
    [org.clojure/data.json "0.2.6"]]

  :aliases {
    "test" ["midje"]}
  :profiles {
    :dev {
      :dependencies [[midje "1.6.3"]]
      :plugins      [[lein-midje "3.1.3"]]}})

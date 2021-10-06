(ns datahike-test.postgres-db
  (:require [datahike-postgres.core]
            [datahike-test.schema])
)

(defn bar []
  "do nothing"
  (println "Starting Postgres"))
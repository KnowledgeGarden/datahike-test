(ns datahike-test.core
  (:require [datahike.api :as d]
            [datahike-postgres.core])
  (:gen-class))

;; config for an in-memory datastore
(def config {:store {:backend :mem}
             :schema-flexibility :read
             :keep-history? true})
(d/create-database config)
(def conn (d/connect config))

(defn foo
  "I don't do a whole lot."
  []
  (println "Hello, World!\n")
;; 21-10-05 22:58:50 Jacks-MBP.home DEBUG [datahike.config:127] - Using config  {:store {:id "default", :backend :mem}, :keep-history? true, :name "grieving-serotine-bat", :schema-flexibility :read, :index :datahike.index/hitchhiker-tree}
;; 21-10-05 22:58:50 Jacks-MBP.home DEBUG [datahike.config:127] - Using config  {:store {:id "default", :backend :mem}, :keep-history? true, :name "strange-european-wildcat", :schema-flexibility :read, :index :datahike.index/hitchhiker-tree}
;; Hello, World!
  (println "D" )
  ;; setup the schema
  (println (d/transact conn [{:db/ident :name
                      :db/valueType :db.type/string
                      :db/cardinality :db.cardinality/one }
                     {:db/ident :age
                      :db/valueType :db.type/long
                      :db/cardinality :db.cardinality/one }]))
;; #datahike.db.TxReport{:db-before #datahike/DB 
;; {:max-tx 536870912 :max-eid 0}, 
;; :db-after #datahike/DB
;; {:max-tx 536870913 :max-eid 2},
;; :tx-data [#datahike/Datom [536870913
;; :db/txInstant #inst "2021-10-05T23:01:05.297-00:00" 536870913 true]
;; #datahike/Datom [1 :db/ident :name 536870913 true]
;; #datahike/Datom [1 :db/valueType :db.type/string 536870913 true] #datahike/Datom [1 :db/cardinality :db.cardinality/one 536870913 true] #datahike/Datom [2 :db/ident :age 536870913 true] #datahike/Datom [2 :db/valueType :db.type/long 536870913 true] #datahike/Datom [2 :db/cardinality :db.cardinality/one 536870913 true]], :tempids #:db{:current-tx 536870913}, :tx-meta nil}

  
  )

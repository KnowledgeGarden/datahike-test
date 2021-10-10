(ns datahike-test.schema)

;; a space to experiment with database schema.
;; a default schema looks like
;;  { entity, attribute, value, transaction, truth }
;; but if we want to craft compound tuples 
;;   e.g. nested entities or values
;; we need more complexity
;;  { entity, entityType, attribute, value, valueType, transaction, truth }
;;  when we do that, a nested tuple needs identity
;;  { id, entity, entityType, attribute, value, valueType, transaction, truth }
;; to round things out, we may want to do probabilistic reasoning
;;  { id, entity, entityType, attribute, value, valueType, transaction, probability, truth }
;; where "truth" is `true` until a tuple is rescinded
;; NOTE: these ideas are locked into the structure made by Datahike.
;; Here are some domain schema datoms from early testing in core.clj
;; #datahike/Datom [1 :db/ident :name 536870913 true]
;; #datahike/Datom [1 :db/valueType :db.type/string 536870913 true]
;; #datahike/Datom [1 :db/cardinality :db.cardinality/one 536870913 true]
;; #datahike/Datom [2 :db/ident :age 536870913 true]
;; #datahike/Datom [2 :db/valueType :db.type/long 536870913 true]
;; #datahike/Datom [2 :db/cardinality :db.cardinality/one 536870913 true]]
;; Datahike defines a Datom in datahike/datom.clj: [e a v tx added]
;; @metasoarous suggested the idea of turning facts into entities
;;  which is akin to what I do in topic maps: relations (associations) are topics
;; He suggested something like this
;; {:fact/objectType :fact.type/CausalRelation
;;  :fact/subject A
;;  :fact.subject/causes B}
;; for the assertion { A causes B }
;; This means we will need a schema to put behind a DSL to manipulate complex entities
;; This will likely require a collection of Datalog rules for manipulation
;;


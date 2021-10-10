(ns datahike-test.core-scheme

;; exploring a kind of "upper ontology"
;; using some topic map terms to construct domain models,
;; each of which will include its own vocabulary

;; Here, we are defining an entity's core attributes, using
;; "locator" in place of "id" << might drop that
;; "label" where an entity can have many labels - synonyms
;;    though it's not out of the question that some KB will
;;    use the SKOS conventions instead of simple labels
;; "sub-of" to specify taxonomy - with multiple inheritance possible
  
  (defn core-ont
    []
    [{:db/ident :locator
      :db/valueType :db.type/string
      :db/cardinality :db.cardinality/one}
     {:db/ident :label
      :db/valueType :db.type/string
      :db/cardinality :db.cardinality/many} ;; many labels
     {:db/ident :sub-of
      :db/valueType :db.type/string
      :db/cardinality :db.cardinality/many}])) ;; multiple inheritance


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

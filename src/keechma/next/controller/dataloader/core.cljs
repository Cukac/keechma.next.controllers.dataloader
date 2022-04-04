(ns keechma.next.controller.dataloader.core
  (:require [keechma.next.protocols :as keechma-pt]
            [keechma.next.controller.dataloader.controller]
            [keechma.next.controller.dataloader.protocols :as pt]))

(derive :keechma/dataloader :keechma/controller)

(def req (keechma-pt/make-api-proxy pt/req))
(def cached (keechma-pt/make-api-proxy pt/cached))

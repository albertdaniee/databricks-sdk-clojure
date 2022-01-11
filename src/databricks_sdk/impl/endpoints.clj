(ns databricks-sdk.impl.endpoints)

(def request
  {:clusters/create            {:method      :post
                                :uri         "/api/2.0/clusters/create"
                                :response-fn :cluster_id}
   :clusters/list              {:method      :get
                                :uri         "/api/2.0/clusters/list"
                                :response-fn :clusters}
   :clusters/edit              {:method :post
                                :uri    "/api/2.0/clusters/edit"}
   :clusters/start             {:method :post
                                :uri    "/api/2.0/clusters/start"}
   :clusters/terminate         {:method :post
                                :uri    "/api/2.0/clusters/delete"}
   :clusters/permissions       {:method :patch
                                :uri    "/api/2.0/permissions/clusters/%s"
                                :query-params [:cluster-id]}
   :libraries/install          {:method :post
                                :uri    "/api/2.0/libraries/install"}
   :libraries/status           {:method :get
                                :uri    "/api/2.0/libraries/cluster-status?cluster_id=%s"
                                :query-params [:cluster-id]}
   :scim/users                 {:method :get
                                :uri    "/api/2.0/preview/scim/v2/Users"}
   :scim/get-user-id           {:method :get
                                :uri    "/api/2.0/preview/scim/v2/Users?filter=userName+eq+%s"
                                :query-params [:email]}
   :scim/remove-role-from-user {:method :patch
                                :uri    "/api/2.0/preview/scim/v2/Users/%"
                                :query-params [:databricks-user-id]}})
              
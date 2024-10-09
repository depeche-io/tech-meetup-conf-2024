kubectl apply -f https://github.com/knative/serving/releases/download/knative-v1.15.2/serving-crds.yaml
kubectl apply -f https://github.com/knative/serving/releases/download/knative-v1.15.2/serving-core.yaml

kubectl apply -l knative.dev/crd-install=true -f ./2-1-istio.yaml
kubectl apply -f https://github.com/knative/net-istio/releases/download/knative-v1.15.1/istio.yaml

kubectl apply -f https://github.com/knative/net-istio/releases/download/knative-v1.15.1/net-istio.yaml

#kubectl --namespace istio-system get service istio-ingressgateway

#kubectl apply -f https://github.com/knative/serving/releases/download/knative-v1.15.2/serving-hpa.yaml

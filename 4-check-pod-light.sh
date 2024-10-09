date && k apply -f pod-light.yaml && k wait --for=condition=ready pod pod-light && date && k delete po pod-light

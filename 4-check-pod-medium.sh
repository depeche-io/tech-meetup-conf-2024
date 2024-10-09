date && k apply -f pod-medium.yaml && k wait --for=condition=ready pod pod-medium && date && k delete po pod-medium

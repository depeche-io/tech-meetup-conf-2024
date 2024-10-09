helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
helm repo update

helm install main prometheus-community/kube-prometheus-stack


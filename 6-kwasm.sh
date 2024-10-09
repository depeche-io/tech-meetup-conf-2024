helm repo add kwasm http://kwasm.sh/kwasm-operator/
helm install -n kwasm --create-namespace kwasm-operator kwasm/kwasm-operator

kubectl annotate node --all kwasm.sh/kwasm-node=true


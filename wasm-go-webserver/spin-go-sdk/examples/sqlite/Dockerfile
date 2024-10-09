FROM scratch
COPY spin.toml /spin.toml
COPY main.wasm /target/wasm32-wasi/release/hello_docker.wasm
ENTRYPOINT ["/spin.toml"]

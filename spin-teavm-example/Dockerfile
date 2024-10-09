# syntax=docker/dockerfile:1
FROM scratch
COPY ./target/generated/wasm/teavm-wasm/classes.wasm /app.wasm
ENTRYPOINT [ "/app.wasm" ]

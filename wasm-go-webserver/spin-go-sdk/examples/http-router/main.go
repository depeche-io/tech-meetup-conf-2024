package main

import (
	"fmt"
	"net/http"

	spinhttp "github.com/fermyon/spin-go-sdk/http"
)

func init() {
	spinhttp.Handle(func(w http.ResponseWriter, r *http.Request) {
		router := spinhttp.NewRouter()
		router.GET("/hello/:name", Hello)
		router.GET("/this/will/*catchAll", CatchAll)

		router.ServeHTTP(w, r)
	})
}

func Hello(w http.ResponseWriter, _ *http.Request, ps spinhttp.Params) {
	sum := 0
	for i := 0; i < 1000000000; i++ {
		primes := [6]int{2, 3, 5, 7, 11, 13}
		//for o := 0; o < 1000000000; o++ {
		for o := 0; o < 2000; o++ {
			for q := 0; q < 6; q ++ {
				var s []int = primes[1:4]
				sum += len(s) + q / 1000 + o / 1000
			}
		}
	}
	fmt.Fprintf(w, "hello, %s %d times!\n", ps.ByName("name"), sum)
	
}

func CatchAll(w http.ResponseWriter, _ *http.Request, ps spinhttp.Params) {
	fmt.Fprintf(w, "catch all: %s!\n", ps.ByName("catchAll"))
}

func main() {}

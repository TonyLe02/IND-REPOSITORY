package test

import (
	"log"
	"os"
)

func test() {
	src, err := os.Open("test.txt")
	if err != nil {
		log.Fatal(err)
	}

	defer src.Close()
	log.Println(src)

	var buffer []byte
	buffer = make([]byte, 1)

	for n:= 0 
	n, err := src.Read(buffer)
	if err != nil {
		log.Fatal(err)
	}

	log.Println(string(buffer[:n]))
}

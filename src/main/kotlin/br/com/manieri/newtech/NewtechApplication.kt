package br.com.manieri.newtech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NewtechApplication

fun main(args: Array<String>) {
	runApplication<NewtechApplication>(*args)
}

package dev.haja.java2kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Java2KotlinApplication

fun main(args: Array<String>) {
    runApplication<Java2KotlinApplication>(*args)
}

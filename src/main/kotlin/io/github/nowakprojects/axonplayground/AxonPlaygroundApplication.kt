package io.github.nowakprojects.axonplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AxonPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<AxonPlaygroundApplication>(*args)
}


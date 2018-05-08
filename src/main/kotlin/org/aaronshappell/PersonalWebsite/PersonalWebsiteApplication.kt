package org.aaronshappell.PersonalWebsite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PersonalWebsiteApplication

fun main(args: Array<String>) {
    runApplication<PersonalWebsiteApplication>(*args)
}

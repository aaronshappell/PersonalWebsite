package org.aaronshappell.PersonalWebsite

import org.aaronshappell.PersonalWebsite.projects.Project
import org.aaronshappell.PersonalWebsite.projects.ProjectService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class PersonalWebsiteApplication {
    @Bean
    fun init(projectService: ProjectService): CommandLineRunner {
        return CommandLineRunner {
            projectService.addProject(Project("Test Project 1", "This is a test", "/images/aaron.png"))
            projectService.addProject(Project("Test Project 2", "This is another test", "/images/aaron.png"))
            projectService.addProject(Project("Test Project 3", "This is yet another test", "/images/aaron.png"))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<PersonalWebsiteApplication>(*args)
}

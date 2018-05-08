package org.aaronshappell.PersonalWebsite

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ProjectsController {
    @GetMapping("/projects")
    fun projects(): String = "projects"
}
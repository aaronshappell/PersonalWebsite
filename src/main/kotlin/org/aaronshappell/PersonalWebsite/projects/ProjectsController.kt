package org.aaronshappell.PersonalWebsite.projects

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ProjectsController {
    @Autowired
    lateinit var projectService: ProjectService

    @GetMapping("/projects")
    fun projects(model: Model): String {
        model.addAttribute("projects", projectService.getProjects())
        return "projects"
    }
}
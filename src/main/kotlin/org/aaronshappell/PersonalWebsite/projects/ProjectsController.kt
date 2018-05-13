package org.aaronshappell.PersonalWebsite.projects

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class ProjectsController {
    @Autowired
    lateinit var projectService: ProjectService

    @GetMapping("/projects")
    fun projects(@RequestParam(value = "api", defaultValue = "false") api: String, model: Model): String {
        model.addAttribute("projects", projectService.getProjects())
        if(api == "true"){
            return "projects :: content"
        }
        model.addAttribute("view", "projects")
        return "layout"
    }
}
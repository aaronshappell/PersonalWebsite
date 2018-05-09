package org.aaronshappell.PersonalWebsite.projects

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProjectService {
    @Autowired
    lateinit var projectRepository: ProjectRepository

    fun addProject(project: Project){
        projectRepository.save(project)
    }

    fun getProjects(): List<Project> {
        return projectRepository.findAll() as List<Project>
    }
}
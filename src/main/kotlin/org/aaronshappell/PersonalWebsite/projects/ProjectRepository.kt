package org.aaronshappell.PersonalWebsite.projects

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectRepository : CrudRepository<Project, Long> {
    override fun findAll(): List<Project>
}
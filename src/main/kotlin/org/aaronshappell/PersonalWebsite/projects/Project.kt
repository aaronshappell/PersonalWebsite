package org.aaronshappell.PersonalWebsite.projects

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Project(
        val name: String,
        val content: String,
        val image: String,
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0
)
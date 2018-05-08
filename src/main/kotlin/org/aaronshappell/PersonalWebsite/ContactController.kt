package org.aaronshappell.PersonalWebsite

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ContactController {
    @GetMapping("/contact")
    fun contact(): String = "contact"
}
package org.aaronshappell.PersonalWebsite

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class CVController {
    @GetMapping("/cv")
    fun cv(): String = "cv"
}
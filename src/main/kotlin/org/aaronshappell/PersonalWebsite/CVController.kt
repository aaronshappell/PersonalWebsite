package org.aaronshappell.PersonalWebsite

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CVController {
    @GetMapping("/cv")
    fun cv(): String = "cv"
}
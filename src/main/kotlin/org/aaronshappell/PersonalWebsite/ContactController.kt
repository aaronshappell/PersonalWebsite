package org.aaronshappell.PersonalWebsite

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class ContactController {
    @GetMapping("/contact")
    fun contact(@RequestParam(value = "api", defaultValue = "false") api: String, model: Model): String {
        if(api == "true"){
            return "contact :: content"
        }
        model.addAttribute("view", "contact")
        return "layout"
    }
}
package org.aaronshappell.PersonalWebsite

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class HomeController {
    @GetMapping("/")
    fun home(@RequestParam(value = "api", defaultValue = "false") api: String, model: Model): String {
        if(api == "true"){
            return "home :: content"
        }
        model.addAttribute("view", "home")
        return "layout"
    }
}
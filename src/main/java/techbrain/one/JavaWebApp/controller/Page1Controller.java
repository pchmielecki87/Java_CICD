package techbrain.one.JavaWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page1Controller {

    @GetMapping("/page1")
    public String page1(Model model) {
        model.addAttribute("message", "To jest podstrona 1.");
        return "page1";
    }
}

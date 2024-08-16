package techbrain.one.JavaWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page3Controller {

    @GetMapping("/page3")
    public String page3(Model model) {
        model.addAttribute("message", "To jest podstrona 3.");
        return "page3";
    }
}
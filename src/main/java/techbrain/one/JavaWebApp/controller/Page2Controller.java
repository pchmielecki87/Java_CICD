package techbrain.one.JavaWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page2Controller {

    @GetMapping("/page2")
    public String page2(Model model) {
        model.addAttribute("message", "This is page 2.");
        return "page2View"; // Make sure this matches the template name (e.g., page2View.html)
    }
}

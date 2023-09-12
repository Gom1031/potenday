package project.Project1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

    @GetMapping("/")
    public RedirectView redirectRoot() {
        return new RedirectView("/main");
    }
}

package io.group.studypro.project.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class linking {

    @RequestMapping("/s1/growait/test")
    public String main () {
        return "../static/main";
    }
}

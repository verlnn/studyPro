package io.group.studypro.project.domain.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/s1/growait")
public class userController {

    @GetMapping("/main")
    public String mainView () {
        return "../static/";
    }


}

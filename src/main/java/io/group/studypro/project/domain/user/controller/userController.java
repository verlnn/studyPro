package io.group.studypro.project.domain.user.controller;

import io.group.studypro.project.core.config.TransferJson;
import io.group.studypro.project.domain.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RequestMapping("/api")
@RestController
public class userController {

    @Autowired
    TransferJson transferJson;

    @GetMapping("/hello")
    public String test() {
        return "Hello, world!";
    }

    @GetMapping("/test")
    public ResponseEntity<?> response () {
        return ResponseEntity.ok("test");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login (HttpServletRequest request) throws IOException {

        UserDTO parseJson = transferJson.processedFromJson(request);
        String userId = parseJson.getUserId();
        String userPassword = parseJson.getUserPassword();

        return ResponseEntity.ok(null);
    }
}
/*
@Slf4j
@RestController
@RequestMapping("/s1/growait")
public class userController {

    @GetMapping("/main")
    public String mainView () {
        return "test";
    }
}
*/

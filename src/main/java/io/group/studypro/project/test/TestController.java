package io.group.studypro.project.test;

import io.group.studypro.project.domain.user.repository.UserRepository;
import io.group.studypro.project.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class TestController {

    private final TestService testService;

    @GetMapping("/getUserName")
    public ResponseEntity<?> getUserName() {

        TestDTO datum = TestDTO.builder()
                .name("Hong Gil Dong")
                .build();

        String userName = datum.getUserName();

        return ResponseEntity.ok(userName);
    }

    @PostMapping("/updateUserName")
    public ResponseEntity<?> updateUserName () {

        TestDTO datum = TestDTO.builder()
                .name("Hong Gil Dong")
                .build();

        String userName = datum.getUserName();
        log.info("userName : {}", userName);

        datum.updateUserName("홍길동");
        userName = datum.getUserName();
        log.info("userName : {}", userName);

        return ResponseEntity.ok(userName);
    }
}

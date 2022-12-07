package io.group.studypro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StudyProApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyProApplication.class, args);
    }
}

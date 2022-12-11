package io.group.studypro.project.test;

import com.sun.istack.NotNull;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class TestDTO {

    @NonNull
    @Setter
    private String name;
    private int age;

    public String getUserName () {
        return this.name;
    }

    public void updateUserName (String updateName) {
        this.name = updateName;
    }

}




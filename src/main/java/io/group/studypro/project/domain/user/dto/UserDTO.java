package io.group.studypro.project.domain.user.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private String userId;
    private String userPassword;
    private String userName;
    private Date enterSiteDate;
    private Date terminateDate;
}

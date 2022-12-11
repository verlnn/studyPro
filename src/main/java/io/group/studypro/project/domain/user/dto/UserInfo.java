package io.group.studypro.project.domain.user.dto;

import io.group.studypro.project.core.exception.BaseException;
import io.group.studypro.project.core.exception.ErrorType;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.Optional;

@Data
@Builder
public class UserInfo {
    private String userId;
    private String userPassword;
    private String userName;
    private Date enterSiteDate;
    private Date terminateDate;

    private Boolean checkId;
    private Boolean matchInfo;

}

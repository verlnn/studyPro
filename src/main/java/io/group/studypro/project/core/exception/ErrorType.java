package io.group.studypro.project.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {

    //USER
    USER_NOT_EXIST("USER001", "존재하지 않는 아이디입니다.",  HttpStatus.BAD_REQUEST),
    USER_WRONG_PASSWORD("USER002", "비밀번호가 일치하지 않습니다.", HttpStatus.BAD_REQUEST),
    EMPTY_USER_ID("USER003", "ID를 입력해주세요.", HttpStatus.BAD_REQUEST),
    EMPTY_USER_PASSWORD("USER004", "비밀번호를 입력해주세요.", HttpStatus.BAD_REQUEST),

    ;

    private final String code;
    private final String message;
    private final HttpStatus status;

}

package io.group.studypro.project.domain.user.service;

import io.group.studypro.project.core.exception.BaseException;
import io.group.studypro.project.core.exception.ErrorType;
import io.group.studypro.project.domain.user.dto.UserInfo;
import io.group.studypro.project.domain.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
public class UserService {

    @Autowired(required = false)
    private UserRepository userRepository;


/*
    public Boolean existUser(UserInfo userInfo) {

        String userId = Optional.ofNullable(userInfo.getUserId())
                .orElseThrow(() -> new BaseException(ErrorType.EMPTY_USER_ID));
        String userPassword = Optional.ofNullable(userInfo.getUserPassword())
                .orElseThrow(() -> new BaseException(ErrorType.EMPTY_USER_PASSWORD));

        log.info("userId : {}", userId);
        log.info("userPassword : {}", userPassword);

        //todo: DB 연결 후 아래 쿼리 추가
//        userRepository.checkExistId(userId);
        Boolean checkExistId = false;
        if (!checkExistId) throw new BaseException(ErrorType.USER_NOT_EXIST);

//        userRepository.checkMatchUserInfo(userId, userPassword);
        Boolean checkMatchUserInfo = false;
        if (!checkMatchUserInfo) throw new BaseException(ErrorType.USER_WRONG_PASSWORD);

        return true;
    }
*/


    public Boolean existUser (Map<String, Object> resultMap) {

        Boolean checkExistId = (Boolean) resultMap.get("checkId");
        Boolean checkMatchUserInfo = (Boolean) resultMap.get("matchInfo");

        if (!checkExistId) throw new BaseException(ErrorType.USER_NOT_EXIST);

        if (!checkMatchUserInfo) throw new BaseException(ErrorType.USER_WRONG_PASSWORD);

        return true;

    }
}

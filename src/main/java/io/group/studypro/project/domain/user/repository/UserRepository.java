package io.group.studypro.project.domain.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Mapper
public interface UserRepository {

    Boolean checkExistId(String userId);
    Boolean checkMatchUserInfo(String userId, String userPassword);

}

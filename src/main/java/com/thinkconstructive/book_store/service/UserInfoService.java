package com.thinkconstructive.book_store.service;

import com.thinkconstructive.book_store.dto.UserInfoDto;
import com.thinkconstructive.book_store.model.UserInfo;
import org.springframework.stereotype.Service;


public interface UserInfoService {
    UserInfoDto createUser(UserInfoDto userInfoDto);

    String getUserInfo(UserInfoDto userInfoDto);
}

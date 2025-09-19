package com.thinkconstructive.book_store.service;

import com.thinkconstructive.book_store.dto.UserInfoDto;



public interface UserInfoService {
    UserInfoDto createUser(UserInfoDto userInfoDto);

    String getUserInfo(UserInfoDto userInfoDto);
}

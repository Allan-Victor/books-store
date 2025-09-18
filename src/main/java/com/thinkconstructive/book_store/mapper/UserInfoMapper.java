package com.thinkconstructive.book_store.mapper;

import com.thinkconstructive.book_store.dto.UserInfoDto;
import com.thinkconstructive.book_store.model.UserInfo;

public class UserInfoMapper {
    public static UserInfoDto toDto(UserInfo userInfo){
        return UserInfoDto.builder()
                .username(userInfo.getUserName())
                .password(userInfo.getPassword())
                .roles(userInfo.getRoles())
                .build();
    }
    public static  UserInfo toModel(UserInfoDto userInfoDto){
        return UserInfo.builder()
                .userName(userInfoDto.username())
                .password(userInfoDto.password())
                .roles(userInfoDto.roles())
                .build();
    }
}

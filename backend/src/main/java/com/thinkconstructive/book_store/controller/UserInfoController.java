package com.thinkconstructive.book_store.controller;

import com.thinkconstructive.book_store.dto.UserInfoDto;
import com.thinkconstructive.book_store.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-info")
@RequiredArgsConstructor
public class UserInfoController implements UserInfoApi {
    private final UserInfoService userInfoService;

    @Override
    public ResponseEntity<String> createUserInfo(UserInfoDto userInfoDto) {
        UserInfoDto user = userInfoService.createUser(userInfoDto);
        return new ResponseEntity<>("User "+ user.username() + " is created", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> getUserInfo(UserInfoDto userInfoDto) {
        return new ResponseEntity<>(userInfoService.getUserInfo(userInfoDto), HttpStatus.OK);
    }
}

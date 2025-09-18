package com.thinkconstructive.book_store.controller;

import com.thinkconstructive.book_store.dto.UserInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserInfoApi {

    @PostMapping("/register")
    ResponseEntity<String> createUserInfo(@RequestBody UserInfoDto userInfoDto);


    @PostMapping("/login")
    ResponseEntity<String> getUserInfo(@RequestBody UserInfoDto userInfoDto);

}

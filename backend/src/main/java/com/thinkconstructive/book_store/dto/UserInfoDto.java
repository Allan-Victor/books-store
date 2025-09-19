package com.thinkconstructive.book_store.dto;

import lombok.Builder;

@Builder
public record UserInfoDto(String username,
                          String password,
                          String roles) {
}

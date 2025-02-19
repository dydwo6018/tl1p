package com.sparta.tl3p.backend.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginResponseDto {

    private String accessToken;
    private String refreshToken;

}

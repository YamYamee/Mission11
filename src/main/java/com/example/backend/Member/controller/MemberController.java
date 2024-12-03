package com.example.backend.Member.controller;

import com.example.backend.Member.dto.MemberLoginRequestDTO;
import com.example.backend.Member.dto.UserResponseDTO;
import com.example.backend.Member.dto.UserSignUpRequestDto;
import com.example.backend.common.response.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;


@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/users")
@RestController
public class MemberController {


    @CrossOrigin
    @Operation(summary = "회원가입 API!")
    @PostMapping("/sign-up")
    public ApiResponse<String> signUp(@Valid @RequestBody UserSignUpRequestDto userSignUpRequestDto) {
        return ApiResponse.onSuccess(null);
    }

    @CrossOrigin
    @Operation(summary = "로그인 API")
    @PostMapping("/login")
    public ApiResponse<UserResponseDTO> login(@Valid @RequestBody MemberLoginRequestDTO memberLoginRequestDTO) {
        return ApiResponse.onSuccess(null);
    }

    @CrossOrigin
    @Operation(summary = "로그인 API")
    @PostMapping("/oauth/kakao")
    public ApiResponse<UserResponseDTO> socialLogin(@RequestBody HashMap<String, String> requestBody) throws JsonProcessingException {
        return ApiResponse.onSuccess(null); // DTO 만들고 함수 호출
    }
}

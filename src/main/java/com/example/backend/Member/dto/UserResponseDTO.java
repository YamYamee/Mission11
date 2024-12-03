package com.example.backend.Member.dto;


import lombok.*;

@Builder
@Getter
public class UserResponseDTO {
    String nickName;

    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PageResponse {
        String ResponseMessage;
    }
}

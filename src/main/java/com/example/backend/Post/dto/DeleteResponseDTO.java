package com.example.backend.Post.dto;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class DeleteResponseDTO {
    Long postId;
    LocalDateTime deletedAt;
}

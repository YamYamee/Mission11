package com.example.backend.Comment.dto;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class DeleteResponseDTO {
    Long commentId;
    LocalDateTime deletedAt;
}

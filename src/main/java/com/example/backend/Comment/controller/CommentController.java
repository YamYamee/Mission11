package com.example.backend.Comment.controller;

import com.example.backend.Comment.dto.CommentRequestDTO;
import com.example.backend.Comment.dto.CommentResponseDTO;
import com.example.backend.Comment.dto.DeleteResponseDTO;
import com.example.backend.common.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class CommentController {


    @CrossOrigin
    @Operation(summary = "댓글 작성")
    @PostMapping("/comments")
    public ApiResponse<CommentResponseDTO> writePost(@Valid @RequestBody CommentRequestDTO commentRequestDTO) {
        return ApiResponse.onSuccess(null);
    }

    @CrossOrigin
    @Operation(summary = "댓글 수정")
    @PutMapping("/edits/comment/{id}")
    public ApiResponse<CommentResponseDTO> editComment(@PathVariable Long id, @RequestBody CommentRequestDTO commentRequestDTO) {
        return ApiResponse.onSuccess(null);
    }

    @CrossOrigin
    @Operation(summary = "댓글 삭제")
    @DeleteMapping("/comment/{id}")
    public ApiResponse<DeleteResponseDTO> deletePost(@PathVariable Long id) {
        return ApiResponse.onSuccess(null);
    }
}

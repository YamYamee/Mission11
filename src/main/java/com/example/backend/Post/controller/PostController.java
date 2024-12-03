package com.example.backend.Post.controller;


import com.example.backend.common.response.ApiResponse;
import com.example.backend.Post.dto.DeleteResponseDTO;
import com.example.backend.Post.dto.PostRequestDTO;
import com.example.backend.Post.dto.PostResponseDTO;
import com.example.backend.Post.dto.Post_CommentDTO;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class PostController {

    @CrossOrigin
    @Operation(summary = "글 목록 보여주기")
    @GetMapping("/posts/home/{page}")
    public ApiResponse<List<PostResponseDTO>> getPosts(@PathVariable Integer page) {

        return ApiResponse.onSuccess(null);
    }

    @CrossOrigin
    @Operation(summary = "특정 글 보여주기 + 댓글 보여주기")
    @GetMapping("/posts/{id}")
    public ApiResponse<Post_CommentDTO> getDetailPage(@PathVariable Long id) {

        return ApiResponse.onSuccess(null);
    }

    @CrossOrigin
    @Operation(summary = "글 작성")
    @PostMapping("/posts")
    public ApiResponse<PostResponseDTO> writePost(@Valid @ModelAttribute PostRequestDTO postRequestDTO) {

        return ApiResponse.onSuccess(null);
    }

    @CrossOrigin
    @Operation(summary = "글 삭제")
    @DeleteMapping("/posts/{id}")
    public ApiResponse<DeleteResponseDTO> deletePost(@PathVariable Long id) {
        return ApiResponse.onSuccess(null);
    }

    /*
    @CrossOrigin
    @Operation(summary = "좋아요 누르기")
    @DeleteMapping("/posts/likes/{id}")
    public ApiResponse<Posts> likePost(@PathVariable Long id) {
        return ApiResponse.onSuccess(postService.likePost(id));
    }*/

}

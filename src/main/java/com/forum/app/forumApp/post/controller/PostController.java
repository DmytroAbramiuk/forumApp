package com.forum.app.forumApp.post.controller;

import com.forum.app.forumApp.post.dto.PostDto;
import com.forum.app.forumApp.post.request.CreatePostRequest;
import com.forum.app.forumApp.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V1/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/create")
    public PostDto createPost(@RequestBody CreatePostRequest request){
        return postService.createPost(request);
    }
}

package com.forum.app.forumApp.post.service;

import com.forum.app.forumApp.post.dto.PostDto;
import com.forum.app.forumApp.post.request.CreatePostRequest;

public interface PostService {
    public PostDto createPost(CreatePostRequest request);
}

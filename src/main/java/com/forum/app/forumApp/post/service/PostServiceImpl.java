package com.forum.app.forumApp.post.service;

import com.forum.app.forumApp.post.PostEntity;
import com.forum.app.forumApp.post.dto.PostDto;
import com.forum.app.forumApp.post.mapper.PostMapper;
import com.forum.app.forumApp.post.repository.PostRepository;
import com.forum.app.forumApp.post.request.CreatePostRequest;
import com.forum.app.forumApp.user.UserEntity;
import com.forum.app.forumApp.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{
    private final PostMapper postMapper;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Override
    @Transactional
    public PostDto createPost(CreatePostRequest request) {
        PostEntity postEntity = new PostEntity();
        UserEntity user = userRepository.getReferenceById(1L);

        postEntity.setTitle(request.getTitle());
        postEntity.setPostText(request.getPostText());
        postEntity.setUser(user);

        return postMapper.toPostDto(postRepository.save(postEntity));
    }
}

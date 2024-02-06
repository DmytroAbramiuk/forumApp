package com.forum.app.forumApp.post.mapper;

import com.forum.app.forumApp.post.PostEntity;
import com.forum.app.forumApp.post.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostMapper {
    public PostDto toPostDto(PostEntity postEntity){
        PostDto postDto = new PostDto();
        postDto.setId(postEntity.getId());
        postDto.setTitle(postEntity.getTitle());
        postDto.setPostText(postEntity.getPostText());
        postDto.setUsername(postEntity.getUser().getUsername());
        postDto.setCreatedDate(postEntity.getCreatedDate());
        postDto.setUpdatedDate(postEntity.getUpdatedDate());

        return postDto;
    }
}

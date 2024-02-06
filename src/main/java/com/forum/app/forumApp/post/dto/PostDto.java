package com.forum.app.forumApp.post.dto;

import com.forum.app.forumApp.user.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private Long id;

    private String title;

    private String postText;

    private String username;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;
}

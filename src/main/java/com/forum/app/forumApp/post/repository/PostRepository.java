package com.forum.app.forumApp.post.repository;

import com.forum.app.forumApp.post.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

}

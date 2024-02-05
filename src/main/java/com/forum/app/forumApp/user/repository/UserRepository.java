package com.forum.app.forumApp.user.repository;

import com.forum.app.forumApp.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

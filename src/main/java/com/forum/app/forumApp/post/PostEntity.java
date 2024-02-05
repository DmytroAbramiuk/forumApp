package com.forum.app.forumApp.post;

import com.forum.app.forumApp.user.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "posts")
@NoArgsConstructor
@AllArgsConstructor
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String postText;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column
    private LocalDate createdDate;

    @Column
    private LocalDate updatedDate;

    @PrePersist
    protected void onCreate(){
        this.createdDate = LocalDate.now();
        this.updatedDate = LocalDate.now();
    }
}

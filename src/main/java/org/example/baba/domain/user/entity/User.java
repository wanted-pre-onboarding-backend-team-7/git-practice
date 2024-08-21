package org.example.baba.domain.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.baba.domain.user.enums.UserRole;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Builder
    public User(Long userId, String username, String email, String password, UserRole userRole) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = userRole;
    }

}

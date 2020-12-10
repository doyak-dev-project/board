package doyak.dev.study.board.app.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(unique = true)
    private String userId;

    @Column
    private String userNm;

    @Column
    private String userPwd;

    @Column
    @CreationTimestamp
    private LocalDateTime regDt;

    @Column
    @UpdateTimestamp
    private LocalDateTime updDt;

}
package doyak.dev.study.board.web.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponse {
    private String userNm;

    private String token;

    public UserResponse(String userNm, String token) {
        this.userNm = userNm;
        this.token = token;
    }
}

package doyak.dev.study.board.web.resource;


import doyak.dev.study.board.app.domain.User;
import doyak.dev.study.board.app.service.UserService;
import doyak.dev.study.board.web.domain.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping
    public User test(UserRequest userRequest){
        return userService.saveUser(userRequest);
    }
}

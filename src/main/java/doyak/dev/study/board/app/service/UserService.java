package doyak.dev.study.board.app.service;


import doyak.dev.study.board.app.domain.User;
import doyak.dev.study.board.app.repository.UserRepository;
import doyak.dev.study.board.web.domain.UserRequest;
import doyak.dev.study.board.web.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public User saveUser(UserRequest userRequest){

        User user = userMapper.map(userRequest);
        return userRepository.save(user);
    }

}

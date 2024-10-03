package team.dangbalzadle.savememungz.domain.oauthlogin.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.dangbalzadle.savememungz.domain.oauthlogin.api.entity.user.User;
import team.dangbalzadle.savememungz.domain.oauthlogin.api.repository.user.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUser(String userId) {
        return userRepository.findByUserId(userId);
    }
}


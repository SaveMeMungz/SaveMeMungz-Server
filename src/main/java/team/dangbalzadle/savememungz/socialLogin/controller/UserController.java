package team.dangbalzadle.savememungz.socialLogin.controller;

import team.dangbalzadle.savememungz.socialLogin.exception.ResourceNotFoundException;
import team.dangbalzadle.savememungz.socialLogin.model.User;
import team.dangbalzadle.savememungz.socialLogin.repository.UserRepository;
import team.dangbalzadle.savememungz.socialLogin.security.CurrentUser;
import team.dangbalzadle.savememungz.socialLogin.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}

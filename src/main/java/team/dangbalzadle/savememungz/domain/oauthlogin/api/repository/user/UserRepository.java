package team.dangbalzadle.savememungz.domain.oauthlogin.api.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.dangbalzadle.savememungz.domain.oauthlogin.api.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(String userId);
}


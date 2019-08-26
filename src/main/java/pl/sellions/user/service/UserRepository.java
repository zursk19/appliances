package pl.sellions.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sellions.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

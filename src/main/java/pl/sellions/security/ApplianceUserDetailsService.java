package pl.sellions.security;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.sellions.user.domain.User;
import pl.sellions.user.service.UserRepository;

import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class ApplianceUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(isNull(user))
            throw new UsernameNotFoundException("Username not found");
        return new UserDetailsImpl(user);
    }
}

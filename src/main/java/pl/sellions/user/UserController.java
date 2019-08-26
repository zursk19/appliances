package pl.sellions.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sellions.user.service.UserService;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;
}

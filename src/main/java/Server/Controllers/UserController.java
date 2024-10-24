package Server.Controllers;

import Server.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<String> userRegister(){
        return userService.userRegister();
    }

    @GetMapping("/user/login")
    public ResponseEntity<String> userLogin(){
        return userService.loginUser();
    }

    @PutMapping("/user")
    public ResponseEntity<String> userChangePassword(){
        return userService.userChangePassword();
    }

    @DeleteMapping("/user")
    public ResponseEntity<String> userDelete(){
        return userService.deleteUser();
    }

    @GetMapping("/user/groups")
    public ResponseEntity<String> userGetJoinedGroups(){return userService.userGetJoinedGroups();}

    @GetMapping("/user")
    public ResponseEntity<String> userGetAsObject(){
        return userService.userGetAsObject();
    }

    @PutMapping("/user/friend")
    public ResponseEntity<String> userAddFriend(){
        return userService.userAddFriend();
    }
}
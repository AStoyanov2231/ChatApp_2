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
        return userService.reply();
    }

    @GetMapping("/user/login")
    public ResponseEntity<String> userLogin(){
        return userService.reply();
    }

    @PutMapping("/user")
    public ResponseEntity<String> userChangePassword(){
        return userService.reply();
    }

    @DeleteMapping("/user")
    public ResponseEntity<String> userDelete(){
        return userService.reply();
    }

    @GetMapping("/user/groups")
    public ResponseEntity<String> userGetJoinedGroups(){
        return userService.reply();
    }

    @GetMapping("/user")
    public ResponseEntity<String> userGetAsObject(){
        return userService.reply();
    }

    @PutMapping("/user/friend")
    public ResponseEntity<String> userAddFriend(){
        return userService.reply();
    }
}
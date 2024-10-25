package Server.Controllers;

import Server.Model.Entities.Users;
import Server.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<String> userRegister(@RequestParam(name = "username") String username,
                                               @RequestParam(name = "password") String password) {
        boolean isRegistered = userService.userRegister(username, password);

        if (!isRegistered) {
            return new ResponseEntity<>("Username already taken", HttpStatus.CONFLICT);
        }
        else return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
    }

    @GetMapping("/user/login")
    public ResponseEntity<String> userLogin(@RequestParam(name = "username")String username,
                                            @RequestParam(name = "password")String password){
        boolean isLogged = userService.loginUser(username, password);

        if(isLogged){
            return new ResponseEntity<>("Login successful!", HttpStatus.OK);
        }
        else return new ResponseEntity<>("Login error", HttpStatus.CONFLICT);
    }

    @PutMapping("/user/changePassword")
    public ResponseEntity<String> userChangePassword(@RequestParam(name = "username") String username,
                                                     @RequestParam(name = "oldPassword") String oldPassword,
                                                     @RequestParam(name = "newPassword") String newPassword){
        boolean isPasswordChanged = userService.userChangePassword(username, oldPassword, newPassword);

        if(isPasswordChanged){
            return new ResponseEntity<>("Password changed successfully!", HttpStatus.OK);
        }
        else return new ResponseEntity<>("Error while changing password", HttpStatus.CONFLICT);
    }

    @DeleteMapping("/user/deleteUser")
    public ResponseEntity<String> userDelete(@RequestParam(name = "username") String username,
                                             @RequestParam(name = "password") String password){
        boolean isDeletedUser = userService.deleteUser(username, password);

        if(isDeletedUser){
            return new ResponseEntity<>("User deleted successfully!", HttpStatus.OK);
        }
        else return new ResponseEntity<>("Error while deleting user", HttpStatus.CONFLICT);
    }

    //TODO
    @GetMapping("/user/groups")
    public ResponseEntity<String> userGetJoinedGroups(){return userService.userGetJoinedGroups();}
    //TODO
    @GetMapping("/user")
    public ResponseEntity<String> userGetAsObject(){
        return userService.userGetAsObject();
    }

    @PutMapping("/user/addFriend")
    public ResponseEntity<String> userAddFriend(@RequestParam(name = "username") String username,
                                                @RequestParam(name = "friendUsername") String friendUsername){
        boolean isFriendAdded = userService.userAddFriend(username, friendUsername);

        if (isFriendAdded){
            return new ResponseEntity<>("Friend added successfully!", HttpStatus.OK);
        }
        else return new ResponseEntity<>("Error couldn't add friend!", HttpStatus.CONFLICT);
    }
}
package group.ChatApp2.Controllers_Andy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final MainService mainService;

    @Autowired
    public UserController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping("/user")
    public ResponseEntity<ApiResponse> userRegister() {
        return mainService.response("User registered successfully.");
    }

    @GetMapping("/user/login")
    public ResponseEntity<ApiResponse> userLogin() {
        return mainService.response("User login successful.");
    }

    @PutMapping("/user")
    public ResponseEntity<ApiResponse> userChangePassword() {
        return mainService.response("User password changed successfully.");
    }

    @DeleteMapping("/user")
    public ResponseEntity<ApiResponse> userDelete() {
        return mainService.response("User deleted successfully.");
    }

    @GetMapping("/user/groups")
    public ResponseEntity<ApiResponse> userGetJoinedGroups() {
        return mainService.response("Retrieved user's joined groups.");
    }

    @GetMapping("/user")
    public ResponseEntity<ApiResponse> userGetAsObject() {
        return mainService.response("Retrieved user details as an object.");
    }

    @PutMapping("/user/friend")
    public ResponseEntity<ApiResponse> userAddFriend() {
        return mainService.response("Friend added successfully.");
    }
}

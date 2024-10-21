//package group.ChatApp2.Controllers;
//
//import group.ChatApp2.Controllers_Andy.MainController;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class UserController {
//
//    MainController mainController = new MainController();
//
//    @PostMapping("/user")
//    public ResponseEntity<String> userRegister(){
//        return mainController.reply();
//    }
//
//    @GetMapping("/user/login")
//    public ResponseEntity<String> userLogin(){
//        return mainController.reply();
//    }
//
//    @PutMapping("/user")
//    public ResponseEntity<String> userChangePassword(){
//        return mainController.reply();
//    }
//
//    @DeleteMapping("/user")
//    public ResponseEntity<String> userDelete(){
//        return mainController.reply();
//    }
//
//    @GetMapping("/user/groups")
//    public ResponseEntity<String> userGetJoinedGroups(){
//        return mainController.reply();
//    }
//
//    @GetMapping("/user")
//    public ResponseEntity<String> userGetAsObject(){
//        return mainController.reply();
//    }
//
//    @PutMapping("/user/friend")
//    public ResponseEntity<String> userAddFriend(){
//        return mainController.reply();
//    }
//}

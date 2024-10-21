package group.ChatApp2.Controllers.UsersController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserService {

    UserService(){}

    public ResponseEntity<String> reply(){
        return new ResponseEntity<>("huh?", HttpStatus.OK);

    }
}

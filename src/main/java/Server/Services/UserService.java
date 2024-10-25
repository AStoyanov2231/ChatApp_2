package Server.Services;

import Server.Model.Services.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    UserService(){}

    public ResponseEntity<String> reply(){
        return new ResponseEntity<>("huh?", HttpStatus.OK);
    }

    public ResponseEntity<String> userRegister(){
        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }

    public ResponseEntity<String> loginUser(){
        return new ResponseEntity<>("User logged successfully", HttpStatus.OK);
    }

    public ResponseEntity<String> userChangePassword(){
        return new ResponseEntity<>("User password changed successfully", HttpStatus.CREATED);
    }

    public ResponseEntity<String> deleteUser(){
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }

    public ResponseEntity<String> userGetJoinedGroups(){
        return new ResponseEntity<>("Those are user's joined groups:", HttpStatus.OK);
    }

    public ResponseEntity<String> userGetAsObject(){
        return new ResponseEntity<>("This is the user's object", HttpStatus.OK);
    }

    public ResponseEntity<String> userAddFriend(){
        return new ResponseEntity<>("User added friend successfully", HttpStatus.OK);
    }
}
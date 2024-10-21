package group.ChatApp2.Controllers.GroupsController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GroupsService {

    GroupsService(){}

    public ResponseEntity<String> reply(){
        return new ResponseEntity<>("huh?", HttpStatus.OK);

    }
}

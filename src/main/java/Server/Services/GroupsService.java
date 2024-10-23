package Server.Services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GroupsService {

    GroupsService(){}

    public ResponseEntity<String> reply(){
        return new ResponseEntity<>("huh?", HttpStatus.OK);

    }
}

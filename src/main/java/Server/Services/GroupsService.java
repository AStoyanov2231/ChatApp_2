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

    public ResponseEntity<String> createGroup(){
        return new ResponseEntity<>("Group created successfully", HttpStatus.CREATED);
    }

    public ResponseEntity<String> checkIfGroupExists(){
        return new ResponseEntity<>("Group exists", HttpStatus.OK);
    }

    public ResponseEntity<String> addUserToGroup(){
        return new ResponseEntity<>("User added to group", HttpStatus.OK);
    }

    public ResponseEntity<String> getGroupMembers(){
        return new ResponseEntity<>("Group members retrieved", HttpStatus.OK);
    }
}

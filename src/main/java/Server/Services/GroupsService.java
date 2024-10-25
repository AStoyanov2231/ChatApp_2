package Server.Services;

import Server.Model.Entities.Groups;
import Server.Model.Services.IDatabaseService;
import Server.Model.Services.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupsService implements IGroupService {

    private IDatabaseService databaseService;

    @Autowired
    GroupsService(IDatabaseService database){
        this.databaseService = database;
    }

    public ResponseEntity<String> reply(){
        return new ResponseEntity<>("huh?", HttpStatus.OK);
    }

    public ResponseEntity<String> createGroup(){
        return new ResponseEntity<>("Group created successfully", HttpStatus.CREATED);
    }

    /////////
    public List<Groups> listGroups(){
        return databaseService.getGroups();
    }
    ////////

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

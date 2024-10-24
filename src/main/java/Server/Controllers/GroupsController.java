package Server.Controllers;

import Server.Services.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GroupsController {

    private GroupsService groupsService;

    @Autowired
    public GroupsController(GroupsService groupsService) {
        this.groupsService = groupsService;
    }

    @PostMapping("/group/create")
    public ResponseEntity<String> createGroup(){return groupsService.createGroup();}

    @GetMapping("/group")
    public ResponseEntity<String> checkIfGroupExists(){return groupsService.checkIfGroupExists();}

    @PutMapping("/group")
    public ResponseEntity<String> addUserToGroup(){return groupsService.addUserToGroup();}

    @GetMapping("/group/members")
    public ResponseEntity<String> getGroupMembers(){return groupsService.getGroupMembers();}
}
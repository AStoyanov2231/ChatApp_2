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
    public ResponseEntity<String> createGroup(){
        return groupsService.reply();
    }

    @GetMapping("/group")
    public ResponseEntity<String> checkIfGroupExists(){
        return groupsService.reply();
    }

    @PutMapping("/group")
    public ResponseEntity<String> addUserToGroup(){
        return groupsService.reply();
    }

    @GetMapping("/group/members")
    public ResponseEntity<String> getGroupMembers(){
        return groupsService.reply();
    }
}
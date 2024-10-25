package Server.Controllers;

import Server.Model.Entities.Groups;
import Server.Services.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupsController {

    private final GroupsService groupsService;

    @Autowired
    public GroupsController(GroupsService groupsService) {
        this.groupsService = groupsService;
    }

    @PostMapping("/group/create")
    public ResponseEntity<String> createGroup(){return groupsService.createGroup();}

    @GetMapping("/group")
    public ResponseEntity<List<Groups>> getGroups(){
        return new ResponseEntity<List<Groups>>(groupsService.listGroups(), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/group")
    public ResponseEntity<String> addUserToGroup(){return groupsService.addUserToGroup();}

    @GetMapping("/group/members")
    public ResponseEntity<String> getGroupMembers(){return groupsService.getGroupMembers();}
}
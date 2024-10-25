package Server.Controllers;

import Server.Services.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<String> createGroup(@RequestParam(name = "group_name") String group_name){

        if (groupsService.createGroup(group_name)){
            return new ResponseEntity<>("Group created successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Group name is already taken!", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/group")
    public ResponseEntity<String> getGroups(@RequestParam(name = "group_name") String group_name){

        boolean doesGroupExist = groupsService.checkIfGroupExists(group_name);

        if(doesGroupExist) {
            return new ResponseEntity<>("Group exists.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No group", HttpStatus.CONFLICT);
        }
    }

    @PutMapping("/group")
    public ResponseEntity<String> addUserToGroup(@RequestParam(name = "username") String username,
                                                 @RequestParam(name = "group_name") String groupName){

        if (groupsService.addUserToGroup(username, groupName)){
            return new ResponseEntity<>("User added to group successfully!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User is already a member of this group!", HttpStatus.CONFLICT);
        }

    }

    @GetMapping("/group/members")
    public ResponseEntity<List<String>> getGroupMembers(@RequestParam(name = "groupId") Integer groupId){

        return new ResponseEntity<>(groupsService.getGroupMembers(groupId), HttpStatus.OK);


    }
}
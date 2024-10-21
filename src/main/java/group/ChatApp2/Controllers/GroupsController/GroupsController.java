package group.ChatApp2.Controllers.GroupsController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GroupsController {

    GroupsService groupsService;


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

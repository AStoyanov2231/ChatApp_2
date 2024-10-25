package Server.Services;

import Server.Model.Entities.Groups;
import Server.Model.Entities.Users;
import Server.Model.Services.IGroupService;
import Server.Services.Repository.GroupsRepository;
import Server.Services.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GroupsService implements IGroupService {

    private final GroupsRepository groupsRepository;
    private final UsersRepository usersRepository;

    @Autowired
    GroupsService(GroupsRepository groupsRepository, UsersRepository usersRepository){
        this.groupsRepository = groupsRepository;
        this.usersRepository = usersRepository;
    }


    public boolean createGroup(String group_name){
        Optional<Groups> existingGroup = groupsRepository.findByGroupName(group_name);

        if(existingGroup.isPresent()) {
            return false;
        }

        Groups group = new Groups();
        group.setGroupName(group_name);
        groupsRepository.save(group);

        return true;
    }


    public boolean checkIfGroupExists(String groupName){
        Optional<Groups> existingGroup = groupsRepository.findByGroupName(groupName);

        return existingGroup.isPresent();
    }

    public boolean addUserToGroup(String userName, String groupName){

        Optional<Users> optionalUser = usersRepository.findByUsername(userName);
        Optional<Groups> optionalGroup = groupsRepository.findByGroupName(groupName);

        Users user = optionalUser.get();
        Groups group = optionalGroup.get();

        List<Groups> userGroups = user.getGroups();
        if(!userGroups.contains(group)) {
            userGroups.add(group);
            user.setGroups(userGroups);

            List<Users> groupUsers = group.getUsers();

            if (!groupUsers.contains(user)) {
                groupUsers.add(user);
                group.setUsers(groupUsers);
            }

            usersRepository.save(user);
            groupsRepository.save(group);
            return true;
        } else {
            return false;
        }


    }

    public List<String> getGroupMembers(int groupId){
        Optional<Groups> optionalGroup = groupsRepository.findByGroupId(groupId);

        Groups group = optionalGroup.get();
       List<Users> groupUsers = group.getUsers();

        List<String> memberUsernames = new ArrayList<>();

        for (Users member : groupUsers) {
            memberUsernames.add(member.getUsername());
        }

        return memberUsernames;

    }

    /////////
//    public List<Groups> listGroups(){
//        return databaseService.getGroups();
//    }
    ////////
}

package Server.Services;

import Server.Model.Entities.Groups;
import Server.Model.Entities.Users;
import Server.Model.Services.IDatabaseService;
import Server.Model.Services.IUserService;
import Server.Services.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    private UsersRepository usersRepository;

    @Autowired
    UserService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public boolean userRegister(String username, String password) {
        Optional<Users> existingUser = usersRepository.findByUsername(username);

        if (existingUser.isPresent()) {
            return false;
        }
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        usersRepository.save(user);
        return true;
    }

    public boolean loginUser(String username, String password) {
        Optional<Users> optionalUser = usersRepository.findByUsername(username);

        if (optionalUser.isEmpty()) {
            return false;
        }
        Users user = optionalUser.get();

        if (user.getPassword().equals(password)){
            return false;
        }
        else return true;
    }

    public boolean userChangePassword(String username, String oldPassword, String newPassword){
        Optional<Users> optionalUser = usersRepository.findByUsername(username);

        if (optionalUser.isEmpty()) { return false; }

        Users user = optionalUser.get();

        if(!oldPassword.equals(user.getPassword())) { return false; }

        user.setPassword(newPassword);
        usersRepository.save(user);
        return true;
    }

    public boolean deleteUser(String username, String password){
        Optional<Users> optionalUser = usersRepository.findByUsername(username);

        if (optionalUser.isEmpty()) {
            return false;
        }
        Users user = optionalUser.get();
        if (!user.getPassword().equals(password)){
            return false;
        }

        for (Groups group : user.getGroups()) {
            group.getUsers().remove(user);
        }

        for (Users friend : user.getFriends()) {
            friend.getFriends().remove(user);
        }

        usersRepository.delete(user);
        return true ;
    }

    public ResponseEntity<String> userGetJoinedGroups(){
        return new ResponseEntity<>("Those are user's joined groups:", HttpStatus.OK);
    }

    public ResponseEntity<String> userGetAsObject(){
        return new ResponseEntity<>("This is the user's object", HttpStatus.OK);
    }

    public boolean userAddFriend(String username, String friendUsername){
        Optional<Users> optionalUser = usersRepository.findByUsername(username);
        Optional<Users> optionalFriend = usersRepository.findByUsername(friendUsername);

        if (optionalUser.isEmpty() || optionalFriend.isEmpty()) {
            return false;
        }

        Users user = optionalUser.get();
        Users friend = optionalFriend.get();

        if (user.getFriends().contains(friend)) {
            return false;
        }

        user.addFriend(friend);
        friend.addFriend(user);

        usersRepository.save(user);
        usersRepository.save(friend);

        return true;
    }
}
package Server.Services;

import Server.Model.Entities.GroupChatLog;
import Server.Model.Entities.Groups;
import Server.Model.Entities.Users;
import Server.Model.Services.IDatabaseService;
import Server.Services.Repository.GroupChatLogRepository;
import Server.Services.Repository.GroupsRepository;
import Server.Services.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService implements IDatabaseService {

    @Autowired
    GroupChatLogRepository chatLogRepository;
    @Autowired
    GroupsRepository groupsRepository;
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    LoggerService logger;

    @Override
    public List<Groups> getGroups() {
        this.logger.Debug("DatabaseService.getGroups()");
        return this.groupsRepository.findAll();
    }
}

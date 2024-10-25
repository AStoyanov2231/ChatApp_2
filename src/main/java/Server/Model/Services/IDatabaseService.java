package Server.Model.Services;

import Server.Model.Entities.GroupChatLog;
import Server.Model.Entities.Groups;
import Server.Model.Entities.Users;

import java.util.List;
import java.util.Optional;

public interface IDatabaseService {

    List<Groups> getGroups();
}

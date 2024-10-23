package Server.Repositories;

import Server.Entities.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupsRepository extends JpaRepository<Groups, Integer> {
    Optional<Groups> findByGroupName(String groupName);
    Optional<Groups> findByGroupId(Integer groupID);
}
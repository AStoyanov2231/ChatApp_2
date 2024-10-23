package Server.Entities;

import jakarta.persistence.*;

@Entity
@Table (name = "chat_groups")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "group_id")
    private int groupId;

    @Column (name = "group_name", unique = true, nullable = false)
    private String groupName;

    // Getters and setters

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}

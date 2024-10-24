package Server.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "group_chat_log")
public class GroupChatLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "msgId")
    private int msgId;

    @Column(name = "username")
    private String userName;

    @Column(name = "message")
    private String message;

    @Column(name = "timeStamp")
    private String timeStamp;
    //private Date timeStamp;

    @Column(name = "groupId")
    private int groupId;

    // Getters and setters


    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}

package MainObjects;

import java.util.Objects;

/**
 * A class for serialization and deserialization of user.
 *
 * @auther Suren Martirosyan
 * @since 24.11.2015.
 */
public class User {

    private Integer id;
    private String userName;
    private String mail;
    private String password;
    private String userKey;

    public User (){}

    public User(Integer id) {
        this.id = Objects.requireNonNull(id);
    }

    public User (Integer id, String userName, String mail, String password, String userKey) {
        this.id = id;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userKey = userKey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String toJson() {
        return null;
        //TODO:
    }
    public void fromJson() {
        //TODO:
    }
}

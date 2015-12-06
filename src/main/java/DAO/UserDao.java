package DAO;

import MainObjects.User;

import java.util.List;

/**
 * Created by user on 24.11.2015.
 */
public interface UserDao {

    void createUser(String userName, String mail, String password, String userKey);

    User getUser(Integer id);

    User getUserByUserKey(String userKey);

    User getUserByMail(String mail);

    List<User> listUsers();

}

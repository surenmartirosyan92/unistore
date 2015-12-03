package DAO;

import MainObjects.User;

import java.util.List;

/**
 * Created by user on 24.11.2015.
 */
public interface UserDao {

    void createUser(String name, String secondName);

    User getUser(Integer id);

    List<User> listUsers();

}

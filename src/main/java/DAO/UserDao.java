package DAO;

import MainObjects.User;

import java.util.List;

/**
 * An interface for accessing users data from database
 *
 * @auther Suren Martirosyan
 * @since 24.11.2015.
 */
public interface UserDao {

    /**
     * Inserts user data to Users table of database
     */
    void createUser(String userName, String mail, String password, String userKey);

    /**
     * Loads user data by id and creates corresponding {@code User} object
     */
    User getUser(Integer id);

    /**
     * Loads user data by user key and creates corresponding {@code User} object
     */
    User getUserByUserKey(String userKey);

    /**
     * Loads user data by user mail and creates corresponding {@code User} object
     */
    User getUserByMail(String mail);

    /**
     * Loads whole user data and returns corresponding list of {@code User} objects
     * @return {@code List<User>}
     */
    List<User> listUsers();

}

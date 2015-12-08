package DAO;

import DAOHelpers.UserMapper;
import MainObjects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * A class for accessing users data from database
 *
 * @auther Suren Martirosyan
 * @since 24.11.2015.
 */
public class UserDaoImpl implements UserDao{

    private JdbcTemplate jdbcTemplate;

    /**
     * Constructor for UserDaoImpl class
     * @param jdbcTemplate An object for working with database
     */
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Inserts user data to Users table of database
     */
    @Override
    public void createUser(User user) {
        String query = "INSERT INTO Users (userName, mail, password, userKey, userLogin) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(query, user.getUserName(), user.getUserMail(), user.getUserPassword(), user.getUserKey(), user.getUserLogin());
    }

    /**
     * Loads user data by id and creates corresponding {@code User} object
     */
    @Override
    public User getUser(Integer id) {
        String query = "SELECT * FROM Users WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{id}, new UserMapper());
    }

    /**
     * Loads user data by user key and creates corresponding {@code User} object
     */
    @Override
    public User getUserByUserKey(String userKey) {
        String query = "SELECT * FROM Users WHERE userKey = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{userKey}, new UserMapper());
    }

    /**
     * Loads user data by user mail and creates corresponding {@code User} object
     */
    @Override
    public User getUserByMail(String mail) {
        String query = "SELECT * FROM Users WHERE mail = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{mail}, new UserMapper());
    }

    /**
     * Loads whole user data and returns corresponding list of {@code User} objects
     * @return {@code List<User>}
     */
    @Override
    public List<User> listUsers() {
        String query = "SELECT * FROM Users";
        return jdbcTemplate.query(query, new UserMapper());
    }

/*    public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDaoImpl) context.getBean("userDao");
        userDao.createUser("asdf2", "asdf2@mail.am", "password2", "key2");
        List<User> users = userDao.listUsers();
        User user = userDao.getUserByMail("asdf2@mail.am");
        System.out.println(user.getUserName());
    }
*/
}

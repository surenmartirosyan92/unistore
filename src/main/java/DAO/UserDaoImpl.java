package DAO;

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
 * Created by user on 24.11.2015.
 */
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class UserDaoImpl implements UserDao{

    private JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createUser(String userName, String mail, String password, String userKey) {
        String query = "INSERT INTO Users (userName, mail, password, userKey) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(query, userName, mail, password, userKey);
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public User getUserByUserKey(String userKey) {
        return null;
    }

    @Override
    public User getUserByMail(String mail) {
        return null;
    }

    public List<User> listUsers() {
        return null;
    }

    public static void main(String [] args) {
/*        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDaoImpl) context.getBean("userDao");
        userDao.createUser("asdf", "fdsa");*/
    }
}

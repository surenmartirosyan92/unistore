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

    public void createUser(String name, String secondName) {
        String query = "INSERT INTO Users (Name, SecondName) VALUES (?, ?)";
        jdbcTemplate.update(query, name, secondName);
    }


    public User getUser(Integer id) {
        return null;
    }


    public List<User> listUsers() {
        return null;
    }

    public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDaoImpl) context.getBean("userDao");
        userDao.createUser("asdf", "fdsa");
    }
}

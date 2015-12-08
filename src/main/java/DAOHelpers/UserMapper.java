package DAOHelpers;

import MainObjects.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A helper class for construction of {@code User} object from loaded user data
 *
 * @auther Suren Martirosyan
 * @since 06.12.2015.
 */
public class UserMapper implements RowMapper<User> {

    /**
     * Constructs {@code User} object from loaded user data
     * @param resultSet loaded user data
     * @param i index of row data
     * @return {@code User} object
     * @throws SQLException
     */
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUserID(resultSet.getInt("id"));
        user.setUserName(resultSet.getString("userName"));
        user.setUserMail(resultSet.getString("mail"));
        user.setUserPassword(resultSet.getString("password"), true);
        user.setUserKey(resultSet.getString("userKey"));
        user.setUserLogin(resultSet.getString("userLogin"));
        return user;
    }
}

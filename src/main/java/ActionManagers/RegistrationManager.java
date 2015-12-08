package ActionManagers;

import java.io.IOException;
import java.sql.SQLException;

import org.codehaus.jackson.JsonParseException;

import DAO.UserDao;
import Helpers.UnistoreException;
import MainObjects.User;

/**
 * registration actions handler class
 * @author Karlen Mkrtchyan
 *
 */
public class RegistrationManager {
	static UserDao userDao = null;//new UserDao();
	synchronized public static User register(String requestData) throws JsonParseException, IOException, SQLException, UnistoreException{
		User user = new User();
		user.fromJson(requestData);
		User newUser  = new User();
		if(!user.isUserVaild()){
			return newUser; // validation problem
		}
		if(userDao.getUserByMail(user.getUserLogin()) == null){
			//newUser = userDao.createUser(user);// Sur es masum aveli lava userin poxancenq
			//loaclDev
		}else{
			System.out.print("user with login" + user.getUserLogin() + " already exists");
			return newUser;
			//throw new UnistoreException();
		}
		return newUser; 
	}
	
}

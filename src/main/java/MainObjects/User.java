package MainObjects;

import java.io.IOException;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

import Helpers.PasswordHash;

/**
 * 
 * User main information class
 * @author Karlen Mkrtchyan
 */
public class User {
	private String userPassword = null;
	private String userLogin = null;
	private String userName = null;
	private Integer userID = null;
	private String userKey = null;;
	
	public void setUserID(Integer userId) {
		this.userID = userId;
	}
	
	public Integer getUserID() {
		return userID;
	}
	
	public void setUserPassword(String userPassword,boolean isHashed){
		if(isHashed){
			this.userPassword = userPassword;
		}else{
			this.userPassword = PasswordHash.createHash(userPassword);
		}
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public boolean validateUser() {

		return true;
	}
	
	public String getHashedPassword(){	
		return PasswordHash.createHash(this.userPassword);
	}
	
	public void generateUserKey(){
		if(this.userKey == null && this.userLogin != null && this.userPassword!=null){
			userKey = PasswordHash.createHash(this.userLogin + this.userPassword);
		}else{
			System.out.print("can't generate user key: User.java");
		}
		
	}
	
	public String getUserKey(){
		return userKey;
	}
	
	public void fromJson(String requestdata) throws JsonParseException, IOException{
		ObjectMapper mapper = new ObjectMapper();
        JsonFactory factory = mapper.getJsonFactory(); // since 2.1 use mapper.getFactory() instead
        JsonParser jp = factory.createJsonParser(requestdata);
        JsonNode node = mapper.readTree(jp);
        if(node.get("userName") != null){
        	 this.setUserName(node.get("userName").getTextValue());
        }
        if(node.get("email") != null){
            this.setUserLogin(node.get("email").getTextValue());
        }
        if(node.get("password") != null){
           this.setUserPassword(node.get("password").getTextValue(),false);	
        }
        this.generateUserKey();
	}
	
	public String toJson() throws JsonParseException, IOException{
		
		 String responceString  = "{\"key\":\"" + this.getUserKey() + "\"";
		 responceString  +=  ",\"userName\":\"" + this.getUserName() + "\"";
         responceString += "}";
		 return responceString;
	}
	
	public boolean isUserVaild(){
		
		
		
		return true;
	} 
	
	@Override
	public String toString() {		
		return "UserName- " + this.userName + " ,login = " + this.userLogin; 
	}
}

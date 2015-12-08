package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.json.simple.JSONObject;

import ActionManagers.RegistrationManager;
import Helpers.UnistoreException;
import MainObjects.User;

/**
 * class for actions coming for registration
 * @author Karlen Mkrthcyan
 *
 */
public class RegistrationServlet extends javax.servlet.http.HttpServlet {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
	        String requestdata = request.getParameter("data");
	        User newUser = null;
	        try {
				try {
					newUser = RegistrationManager.register(requestdata);
				} catch (UnistoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
			}
	        PrintWriter out = response.getWriter();
	        if(newUser.getUserKey() != null){
	            out.println("{");
		        out.println("\"error\": \"user is not registred\",");
		        out.println("}");
		        out.close();
	        }else{
	            out.println("{");
		        out.println("\"message\": \"user is registred\",");
		        out.println("}");
		        out.close();
	        }
	   
	    }

	    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
	        doPost(request, response);
	    }
}
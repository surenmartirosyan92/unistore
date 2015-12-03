package Servlet;


import jdk.nashorn.internal.parser.JSONParser;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


/**
 * Created by Suren Martirosyan on 19.11.2014.
 *
 * A Servlet for transferring data between client and server
 * @author Suren Martirosyan
 */
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String requestData = request.getParameter("data1");
        ObjectMapper mapper = new ObjectMapper();
        JsonFactory factory = mapper.getJsonFactory();
        JsonParser jsonParser = factory.createJsonParser(requestData);
        JsonNode requestJson = mapper.readTree(jsonParser);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Date date = new Date();
        out.write(date.toString());
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}

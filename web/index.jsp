<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.11.2014
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>asdf asdf </title>
  </head>
  <body>
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script>
    function myFunction(){
        $.get('MyServlet', function (data) {
            alert(data);
        });
    }
  </script>
  <jsp:include page="/resources/registrationform.html" />
  <button onclick="myFunction()">Click me</button>
  </body>
</html>

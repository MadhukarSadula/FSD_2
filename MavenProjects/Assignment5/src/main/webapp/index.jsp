 <HTML>
   <head><title>Hello World</title></head>
   
   <body>
      Hello World!<br/>
      <%
         out.println("Your message is this is Maven assignment 5");
      %>
      <%@ page import="java.util.*"%>
<%

ResourceBundle resource=ResourceBundle.getBundle("myapp");
String msg=resource.getString("msg");


%>

   <%=msg%>
      
   </body>
</HTML>

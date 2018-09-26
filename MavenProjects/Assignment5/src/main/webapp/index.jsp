 <HTML>
   <head><title>Hello World</title></head>
   
   <body>
      Hello World!<br/>
      <%
         out.println("Your message is this is Maven assignment 5");
      %>
      <%@ page import="java.util.*"%>
<%


//ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
 

    
    //java.io.InputStream inputStream1 = getServletContext().getResourceAsStream(""/myapp.properties");
//java.io.InputStream inputStream2 =  getServletContext().getResourceAsStream("${directory}/myapp.properties");

Properties mavenProperties= new Properties();
    //mavenProperties.load(inputStream1);
    //String msg1 = (String) mavenProperties.get("msg");
    //Properties mavenProperties2= new Properties();

    //String name = (String) mavenProperties.get("artifactId");
 //mavenProperties2.load(inputStream2 );
    //String msg2 = (String) mavenProperties.get("msg");

%>

    <h1>Message from Dev <%=" ${directory}" %></h1><br>
    <h1></h1>
    
      
   </body>
</HTML>
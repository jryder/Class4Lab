<%-- 
    Document   : result
    Created on : Sep 8, 2013, 10:55:46 PM
    Author     : jorda_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>  
	    
	    <%
                
            Object o = request.getAttribute("msg");    
            String s = "Error";
            if (o!=null){
                s = (String)request.getAttribute("msg"); 
            }            
            out.print(s);
            %>
	
	</h1>
    </body>
</html>

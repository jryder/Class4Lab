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
        <LINK href="main.css" rel="stylesheet" type="text/css">
        <title>RESULTS!!!</title>
    </head>
    <body>
        
        <div>
        <h1>

            <%
            
                 out.print((String)request.getAttribute("msg"));               
                
            
            %>
            
	</h1>
            
            <p>    
            	    <%

                String s = (String)request.getAttribute("sqft");
                out.print("The result is " + s);
            
            %>
            </p>
            
            <p>
                <a href ="index.html">Go back to main page</a>
            </p>
        </div> 
    </body>
</html>

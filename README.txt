Demonstrates using Spring Session with Spring Boot and Spring Security.
 You can log in with the username "user" and the password "password".
 Note: Use same browser in private mode.
 Lab-1
 -----
 1. start 2 instances of the application on 2 different ports, say 8080 and 8081. 
 2. access the application on localhost:8080 and login with success. 
 3. access the application on localhost:8081. notice that the login page is not displayed which means the
 user is logged in even on instance running at 8081.
 
 Lab-2
 -----
 1. stop both the server instances. Start a new instance at port 8083.
 2. try to access localhost:8083. you should see the secured page. This proves that the HttpSession details are
 being saved in MongoDB which is accessible to all instance of the service.
 
 question: Will we still see secured page if the browser is restarted?
 
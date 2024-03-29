Once we place spring security dependency into pom.xml, default behaviour of spring security gets incorporated as part of the application. Once we kick off the server a default password will be generated using generated password and username as user we can access the endpoint unless endpoint is not secured.

We can provide static username and password as part of application.properties file as 
spring.security.user.name=admin
spring.security.user.password=admin

Using these we can access the secured API.

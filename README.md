# SpringBoot-Sample-Application

This is a simple Spring Boot application designed to demonstrate basic Spring Boot functionality such as dependency injection with @Autowired, @Components , logging, and running an embedded Tomcat server.

API Endpoints:
GET /api/hello: 
Returns a ----> Welcome to Spring-Boot Project

use this url -->  http://localhost:8080/api/hello 
to see the output -->  Welcome to Spring-Boot Project

Key Features:
Autowired Dependency Injection: The application demonstrates how to inject dependencies using @Autowired.
Logging: Various logs from Spring Boot and Tomcat are output to the console for debugging and monitoring purposes.
Embedded Tomcat: Spring Boot includes an embedded Tomcat server that runs your application on port 8080 by default.
DevTools: Spring Boot DevTools are enabled for enhanced development features like automatic restarts and live reload.
@Component: Marks a class as a Spring-managed bean. Spring will automatically detect and register it during classpath scanning.
@ComponentScan: Tells Spring where to scan for components, configurations, and services.
@Configuration: Used to indicate that a class contains Spring bean definitions. The beans are typically defined with the @Bean annotation.
@Bean: Used to define individual beans inside a @Configuration class.
@Autowired annotation is used to automatically inject dependencies into Spring-managed beans. It can be applied to fields, constructors, or setter methods.
@Controller annotation is used to define a controller class in a Spring MVC application. It marks the class as a handler for HTTP requests.
@RestController annotation is a specialized version of @Controller for REST APIs. It combines @Controller and @ResponseBody, indicating that the return values of methods will be written directly to the HTTP response as JSON or XML.
@Service annotation is used to define a service class.
@Repository annotation is used to define a Data Access Object (DAO) component. It marks a class as a data repository that interacts with the database, and Spring will handle exception translation (converting database-related exceptions into Spring's DataAccessException).
@Qualifier annotation is used in conjunction with @Autowired to resolve ambiguity when multiple beans of the same type are present. It specifies which bean to inject when there are multiple candidates.
@Value annotation is used to inject values into Spring beans from property files (like application.properties or application.yml), environment variables, or expressions.
@Scope annotation defines the scope of a Spring bean. By default, beans are singleton-scoped, but @Scope can be used to specify other scopes like prototype, request, session, etc.

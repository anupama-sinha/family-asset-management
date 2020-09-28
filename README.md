### Get Started
This is a simple Spring Boot project which discreetly uses below features. Will keep enhancing this project from learning and practice perspective.

### OpenApi3 Swagger Documentation  
* Add dependency and @OpenAPIDefinition in main class.
* Then hit below URL and copy to project and edit accordingly.
> http://localhost:8080/v3/api-docs.yaml
* Then Access Swagger URL below.
> http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config

### H2 In Memory Database
* In memory Database has been used. It can be accessed below.
> http://localhost:8080/h2-console

### Caching
* Spring's default caching has been used in this project for frequently accessed API Endpoints.
* Once empty, DB not checked until TTL(Time to Live), so perform DB check if empty.
* Using keys and sync is recommended. Refer further details below
> https://www.foreach.be/blog/spring-cache-annotations-some-tips-tricks

### Schedulers
* Have kept scheduler to perform scheduled tasks. Change cron.expression as required.

### Global Exception Handler for Controllers
* Used @RestControllerAdvice to have centralized exception handling across all Controller classes
* Avoided use of @ResponseStatus which makes code tightly coupled
* Tomcat Servlet Container redirects to \error by default
* Always have NoHandlerFoundException for API Endpoints not created so as to segregate it from other issues of Legacy Internal Server Errors
* MethodArgumentNotValidException for arguments when empty, null or not given. POJO must have @Valid check. Refer this [link](https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/MethodArgumentNotValidException.html)
* Common exceptions can be clubbed as Exception Arrays as used in this project

### Sequence Generator
* Used Identity Strategy here with allocation size 25
> https://www.objectdb.com/java/jpa/entity/generated

### Top Level JSON Arrays
* Have avoided using direct JSON Arrays in API response. Please find reason below in link.
> https://stackoverflow.com/questions/3503102/what-are-top-level-json-arrays-and-why-are-they-a-security-risk

### JPA & Hibernate Relationship Mapping
* One Product is owned by one member - @OneToOne
* One Member can own multiple Products - @OneToMany
* Refer [Notes](https://github.com/anupama-sinha/anupama-notes/blob/master/hibernate-mapping.md)

### Email/SMS Integration
* In Progress
* [Twilio SMS Notification](https://www.twilio.com/docs/sms/quickstart/java)
* [Email Integration](https://www.baeldung.com/spring-email)

### HateOAS(Hypermedia As The Engine of Application State)
* In Progress

### OpenAPI Swagger Validation
* In Progress

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Hibernate Mapping](https://stackabuse.com/a-guide-to-jpa-with-hibernate-relationship-mapping/)
* [JPA](https://www.objectdb.com/java/jpa)
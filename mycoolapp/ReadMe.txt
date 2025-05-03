Running the Spring Boot Application from Command-Line
* Spring Boot apps are self-contained

Running from the command-line has two options

1.  java -jar mycoolapp.jar

2.  mvnw package 
	mvnw spring-boot:run


Spring Boot Properties : The properties are roughly grouped into the following categories
1. Core 
2. Web 
3. Security
4. Data
5. Actuator
6. Integration
7. DevTools
8. Testing 


Spring Container
Primary functions of spring container is 
1. Create and manage objects (Inversion of Control)
2. Inject object's dependencies (Dependency Injection)

Injection Types
There are 2 types of injection with Spring
1. Constructor Injection
2. Setter Injection

Constructor Injection 
Constructor Injection to use when you have required dependencies.

Setter Injection
Setter Injection to use when you have optional dependencies. If dependency is not provided, your app can provide reasonable default logic.

Spring AutoWiring
For Dependency injection, spring can use auto wiring. Spring will look for  a class that matches
* matches by type: class or interface
Spring will inject it automatically ... hence it is auto wired. 

@Component Annotation
@Component Annotation marks the class as a spring bean. A spring bean is just a regular java class that is managed by Spring.
@Component also make the bean available for dependency injection.

The spring framework will perform these operations behind the scenes for you.
Coach theCoach = new CricketCoach();
CoachRestController coachRestController = new CoachRestController(theCoach);

Scanning for Component Classes
Spring will scan your java classes for special annotations
* @Component etc
Automatically register the beans in the Spring container


@SpringBootApplication Annotation is composed of the following annotations:

1. @EnableAutoConfiguration : Enables Spring Boot's auto-configuration support
2. @ComponentScan : Enables component scanning of current package also recursively scans sub-packages
3. @Configuration : Able to register extra beans with @Bean or import other configuration classes

More on Component Scanning
* By default, Spring Boot starts component scanning from same package as your main Spring Boot Application also scans sub-packages recursively.
* This implicitly defines a base search package and allows you to leverage default component scanning so that there is no need to explicitly reference the base package name.

For explicitly defining the packages for scanning we need to use this below syntax
//@SpringBootApplication(scanBasePackages = {"com.springboot.demo.mycoolapp","com.springboot.demo.util"})

Setter Injection
The spring framework will perform these operations behind the scenes for you.
Coach theCoach = new CricketCoach();
CoachRestController coachRestController = new CoachRestController();
coachRestController.setCoach(theCoach); 

Field Injection with Annotation n Auto wiring
In early days, field injection was popular on spring projects. But now it makes the code harder to unit test. However you  will still see it being used on legacy projects.

//no need for constructor or setter
@Autowired
private Coach myCoach;

Qualifiers
Adding @Qualifier Annotation to each Controller

Resolving issue with Multiple Coach implementations
- In the case of multiple Coach implementations
* We resolve it using @Qualifier
* We specified a coach by name

Alternate Solution
Instead of specifying a coach by name using @Qualifier
I simply need a coach... I don't care which coach, If there are multiple coaches then you coaches figure it out and tell me who's the primary coach.

Resolve with @Primary - Only one
* When using @Primary, can have only one for multiple implementations.

Which one: @Primary or @Qualifier?
- @Primary leaves it up to the implementation classes
* Could have the issue of multiple @Primary classes leading to an error

-@Qualifier allows to you be very specific on which bean you want

-In general, I recommended using @Qualifier
* More specific
* Higher priority


Initialization
* By default, when your application starts, all beans are initialized @Component etc and spring will create an instance of each and make them available.

Lazy Initialization 
* Instead of creating all beans up front, we can specify lazy initialization. A bean will only be initialized in the following cases:
- It is needed for dependency injection
- Or it is explicitly requested
* Add the @Lazy annotation to a given class
Lazy Initialization - Global Configuration
Add this entry in application.properties file
spring.main.lazy-initialization=true  

Lazy Initialization Advantages
* Only create objects as needed
* May help with faster startup time if you have large number of components
Lazy Initialization Disadvantages
* If you have web related components like @RestController, not created until requested
* May not discover configuration issues until too late
* Need to make sure you have enough memory for all beans once created 
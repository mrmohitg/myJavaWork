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

 
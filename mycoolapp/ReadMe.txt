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


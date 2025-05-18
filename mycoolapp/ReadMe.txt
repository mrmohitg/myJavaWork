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

Bean Scopes
* Bean Scopes refer to the life cycle of a bean or How long does the bean live or how many instance are created for a bean and how is the bean shared.

Scope			Description
singleton		Create a single shared instance of the bean. Default scope.
prototype		Creates a new bean instance for each container request.
request			Scoped to an HTTP web request. Only used for web applications.
session 		Scoped to an HTTP web session. Only used for web applications.
application 	Scoped to a web application ServletContext. Only used for web applications.
websocket		Scoped to a web socket. Only used for web applications.

Default Scope of Spring Bean is Singleton

What is Singleton?
* Spring container creates only one instance of the bean, by default. It is cached in memory and all dependency injections for the bean will reference the same bean.

Bean Life Cycle 
Container Started -> Bean Instantiated -> Dependencies Injected -> Internal Spring Processing -> Your Custom Init Method -> Bean is ready for use -> Container is Shutdown -> Your Custom Destroy Method -> Stop

Bean Life Cycle Methods / Hooks
- You can add custom code during bean initialization
	* Calling custom business logic methods
	* Setting up handles to resources (db, sockets, file etc)
- You can add custom code during bean destruction
	* Calling custom business logic methods
	* Clean up handles to resources (db, sockets, file etc)
	
Init : method configuration
@PostConstruct 

Destroy : method configuration
@PreDestroy

Java Config Bean - Development Process
* Create @Configuration class
* Define @Bean method to configure the bean
* Inject the bean into our controller

Use case for @Bean
* Make an existing third-party class available to Spring framework
* You may not have access to the source code of third-party class
* However, we would like to use the third-party class as Spring bean

Hibernate / JPA Overview
What is Hibernate?
* A framework for persisting / saving Java objects in a database i.e. www.hibernate.org/orm

Benefits of Hibernate
* Hibernate handles all of the low-level SQL
* Minimizes the amount of JDBC code you have to develop
* Hibernate provides the Object-to-Relational Mapping (ORM)

Object-to-Relational Mapping (ORM)
* The developer defines mapping between Java class and database table

Java Class										Database Table
Student											student
id : int			--->	Hibernate	--->	id INT
firstName : String								first_name VARCHAR(45)
lastname : String 	<---				<---	last_name VARCHAR(45)
email : String									email VARCHAR(45)	

What is JPA?
Jakarta Persistence API (JPA) ... previously known as Java Persistence API. It's a standard API for Object-to-Relational-Mapping (ORM).
It's Only a specification. Defines a set of interfaces and requires an implementation to be usable

JPA - Vendor Implementations

		JPA Spec	
		^	^	
Hibernate	EclipseLink

What are benefits of JPA?
* By having a standard API, we are not locked to vendor's implementation and we can maintain portable, flexible code by coding to JPA spec (interfaces)
* Can theoretically switch vendor implementations	

JPA/Hibernate CRUD Apps
* Create Objects
* Read Objects
* Update Objects
* Delete Objects	

Hibernate/JPA and JDBC
Hibernate / JPA uses JDBC for all database communications

	Our		->		JPA		|	 |	->			
	Java		  Hibernate |JDBC|				Database
	App		<-				|	 |	<-	

MySQL Database	
-MySQL Database includes two components
* MySQL Database Server
* MySQL Workbench

MySQL Database Server
* The MySQL Database Server is the main engine of the database stores data for the database and supports CRUD feature on the data

MySQL Workbench
* MySQL Workbench is a client GUI for interacting with the database for creating database schemas and tables executing SQL queries to retrieve data, perform insert, updates and deletes on data and handle administrative functions such as creating users

Links to download the MsSQL DatabaseServer
https://dev.mysql.com/downloads/mysql/
https://dev.mysql.com/downloads/workbench/ 

user : root
Password : MySQLServer

Automatic Data Source Configuration
* In Spring Boot, Hibernate is the default implementation of JPA
* EntityManager is main component for creating queries etc...
* EntityManager is from Jakarta Persistence API (JPA)
* Based on configurations, Spring Boot will automatically create the beans: DataSorce, EntityManager etc....
* You can then inject these into your application for example DAO

Setting up Project with Spring Initializer
* At Spring Initializer web site, start.spring.io
* Add dependencies 
	- MySQL Driver : mysql-connector-j
	- Spring Data JPA : spring-boot-starter-data-jpa 
* DB connection info from application.properties 

JPA Development Process
* Annotate Java Class
* Develop Java Code to perform database operations

Entity Class 
Entity Class is a Java class that is mapped to a database table. It Must be annotated with @Entity this class can have other constructors but must have a public or protected no-argsument constructor
 
Map Class to database table using these Annotations
@Entity
@Table
@Id
@Column
@GeneratedValue

ID Generation Strategies
		Name								Description
GenerationType.AUTO			Pick an appropriate strategy for the particular database
GenerationType.IDENTITY		Assign primary keys using database identity column
GenerationType.SEQUENCE		Assign primary keys using a database sequence
GenerationType.TABLE		Assign primary keys using an underlying database table to ensure uniqueness		
GenerationType.UUID			Assign primary keys using a globally unique identifier (UUID) to ensure uniqueness

You can define your own CUSTOM generation strategy :-)
* Create implementation of org.hibernate.id.IdentifierGenerator
* Override the method : public Serializable generate(...)

Student Data Access Object
* Responsible for interfacing with the database
* This is common design pattern Data Access Object (DAO)
	
CREDDemoApp		<--->		Student DAO		<--->		Database

Methods List
save(...)
findById(...)
findAll()
findByLastName(...)
update(...)
delete(...)
deleteAll()

* Our DAO needs a JPA Entity Manager
* JPA Entity Manager is the main component for saving / retrieving entities

Student DAO		<--->		Entity Manager		<--->		Database

JPA Entity Manager
* Our JPA Entity Manager needs a Data Source
* The Data Source defines database connection info
* JPA Entity Manager and Data Source are automatically created by Spring Boot
	- Based on the file: application.properties (JDBC URL, user id, password, etc)
* We can autowire / inject the JPA Entity Manager into our Student DAO

Student DAO		<--->		Entity Manager		<--->		DataSource		<--->		Database

What about JpaRepository?
* Spring Data JPA has a JpaRepository interface, This provides JPA database access with minimal coding

Which one EntityManager or JpaRepository?
EntityManager
* If you need low-level control and flexibility, use EntityManager
* Need low-level control over the database operations and want to write custom queries
* Provide low-level access to JPA and work directly with JPA entities
* Complex queries that required advanced feature such as native SQL queries or stored procedure calls
* When you have custom requirements that are not easily handled by higher-level abstractions

JpaRepository
* If you want high-level of abstraction, use JpaRepository
* Provides commonly used CRUD operations out of the box, reducing the amount of code you need to write
* Additional features such as pagination, sorting
* Generate queries based on method names
* Can also create custom queries using @Query 

Spring @Transactional
* Spring provides an @transactional annotation 
* Auto magically begin and end a transaction for your JPA code, this Spring magic happens behind the scenes

Specialized Annotation for DAO's
* Spring provides the @Repository annotation

										@Component
							^			 	^				^	
							|				|				|	
					@RestController		@Repository		   ...
					
* Applied to DAO implementations
* Spring will automatically register the DAO implementation thanks to component-scanning
* Spring also provides translation of any JDBC related exceptions 

Changing Index of MySQL Auto Increment
* ALTER TABLE student_tracker.student AUTO_INCREMENT=3000

Reset Auto Increment starting from 1
* TRUNCATE student_tracker.student

Retrieving an Object
* findById(...)

JPA Query Language (JPQL)
* Query Language for retrieving objects
* Similar in concepts to SQL
	- where, like, order by, join, in, etc... 
* JPQL is based on entity name and entity fields instead of table name and table fields

e.g. Retrieving all objects
	TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);
	List<Student> students = theQuery.getResultList();

e.g. Retrieving Students having lastName = 'Gupta'
	TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName='Gupta'", Student.class);
	List<Student> students = theQuery.getResultList();
  
e.g. Retrieving Students using OR predicate:
	TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName='Gupta' OR 'Garg'", Student.class);
	List<Student> students = theQuery.getResultList();

e.g. Retrieving Students using LIKE predicate:
	TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE email LIKE '%mohit@gmail.com'", Student.class);
	List<Student> students = theQuery.getResultList();

JPQL - Named Parameters
	public List<Student> findByLastName(String lastName){
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);
		theQuery.setParameter("theData", theLastName);
		return thQuery.getResultList();
	}
	
JPQL - Select Clause
* The query examples so far did not specify a "select" clause
* The Hibernate implementation is lenient and allows Hibernate Query Language (HQL)
* For strict JPQL, the "select" clause is required
e.g. TypedQuery<Student> theQuery = entityManager.createQuery("select s FROM Student s", Student.class);	
e.g. TypedQuery<Student> theQuery = entityManager.createQuery("select s FROM Student s WHERE s.email LIKE '%mohit@gmail.com'", Student.class);
e.g. TypedQuery<Student> theQuery = entityManager.createQuery("select s FROM Student s WHERE s.lastName=:theData", Student.class);

Update
entityManager.merge(...);
int numberOfRowsUpdated = entityManager.createQuery("UPDATE Student SET lastName = 'Tester'").executeUpdate();

Delete
entityManager.remove(...);
int numberOfRowsDeleted = entityManager.createQuery("DELETE FROM Student WHERE firstName = 'Nikhil'").executeUpdate();
int numberOfRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

Create database tables from Java code.
* JPA/Hibernate provides an option to auto magically create database tables
* Creates tables based on Java code with JPA/Hibernate annotation
* Useful for development and testing

Java Code  -->	JPA/Hibernate	-->	 	SQL		-->		Database

Configuration
* In Spring Boot configuration file: application.properties
	-spring.jpa.hibernate.ddl-auto=create
* When you run your application, JPA/Hibernate will drop tables then create them
* Based on the JPA/Hibernate annotation in your Java code

Configuration - application.properties
-spring.jpa.hibernate.ddl-auto=PROPERTY-VALUE

PROPERTY-VALUE		Property Description
none				No action will be performed
create				Database tables are dropped followed by database tables creation
create-drop			Database tables are dropped followed by database tables creation. On application shutdown, drop the database tables.
validate			Validate the database tables schema
update				Update the database tables schema

Warning!!
Don't do this(spring.jpa.hibernate.dll-auto=create) on Production database! because all the data will be deleted.

-spring.jpa.hibernate.ddl-auto=create
*Automatic table generation is useful for
	- Database integration testing with in-memory databases
	
REST APIs - REST Web Services
Application Architecture

									city
	My Weather App (client)		----------->		Weather Service(external - provided by External Third Party Server)  
								<-----------
							    weather report

Q. How will we connect to the Weather Service?
A. We can make REST API calls over HTTP. REST is REpresentational State Transfer. Lightweight approach for communicating between applications

Q. What programming language do we use?
A. REST is language independent. The client application can use ANY programming language and the Server application can use ANY programming language

Q. What is the data format?
A. REST applications can use any data format. Commonly see XML and JSON. JSON stands for JavaScript Object Notation.

Currency Converter App

								  $ -> ₹, 100$ 
	My Currency App				--------------->		Currency Service(external)  
								<---------------
							       ₹6478.52 

JSON Basics
Q. What is JSON?
A. JavaScript Object Notation is a lightweight data format for storing and exchanging data... in plain text. It is also language independent. e.g.

{
"id":14,
"firstName":"Mohit",
"lastName":"Gupta"
}

REST over HTTP
* Most common use of REST is over HTTP
* Leverage HTTP methods for CRUD operations
	HTTP Method			CRUD Operation
	POST				Create a new entity
	GET					Read a list of entities or single entity
	PUT					Update an existing entity
	DELETE				Delete an existing entity

HTTP Messages
HTTP Request Message
	* Request Line : The HTTP command
	* Header Variables : Request Metadata
	* Message Body : Contents of message
	
HTTP Response Message
	* Response Line : Server Protocol and Status Code
	* Header Variables : Response Metadata
	* Message Body : Contents of Message

HTTP Response - Status Codes
Code Range		Description			e.g.
100 - 199		Informational
200 - 299		Successful
300 - 399	 	Redirection
400 - 499		Client Error 		401 Authentication Required, 404 File Not Found
500 - 599		Server Error		500	Internal Server Error

MIME Content Types
* MIME stands for Multipurpose Internet Mail-Extention, The message format is described by MIME content type
* Basic Syntax : type/sub-type e.g. text/html, text/plain, application/json, application/xml

Client Tool
PostMan and CURL

Hit this URL through Postman to see Sample JSON Response
https://jsonplaceholder.typicode.com/users

Spring Rest Controller
						/test/hello
REST Client			------------------>			REST Service
					<------------------	
						Hello World!

Web Browser vs Postman
* For simple REST testing for GET request Web Browser and Postman are similar
* For advanced REST testing like POST and PUT etc, Postman has much better support. POSTing JSON data, setting content type or passing HTTP request headers, authentication etc.

Java JSON Data Binding
* Data binding is the process of converting JSON data to a Java POJO
					Data Binding
	JSON 			------------>				Java POJO
					<------------

Jackson Data Binding
* By default, Jackson will call appropriate getter/setter method

JSON to Java POJO
* Convert JSON to Java POJO... call setter methods on POJO

Java POJO to JSON
* Convert Java POJO to JSON... call getter method on POJO

Spring and Jackson Support
* When building Spring REST application Spring will automatically handle Jackson Integration.
* JSON data being passed to REST controller is converted to POJO
* Java object being returned from REST controller is converted to JSON

Spring REST - Path Variables
Path Variables
* Retrieve a single player by id 
GET	/mycoolapp/player/footballers/{playerId}	Retrieve a single player

Spring REST - Exception Handling
* Bad Player Id of 9999 is giving Internal Server Error with the status as 500
* But it should give proper message i.e. Player not found - 9999 with the status as 404
 
Development Process
1. Create a custom error response class
2. Create a custom exception class
3. Update REST service to throw exception if player is not found
4. Add a exception handler method using @ExceptionHandler

Step 1: Create a custom error response class
* The custom error response class will be sent back to client as JSON
* We will define as Java Class (POJO)
* Jackson will handle converting it to JSON

Step 2: Create a custom exception class
* The custom player exception will used by our REST service
* In our code, if we can't find player, then we'll throw an exception
* Need to define a custom player exception class
	- PlayerNotFoundException

Step 3: Update REST service to throw exception if player is not found

Step 4: Add a exception handler method using @ExceptionHandler
* Define exception handler method(s) with @ExceptionHandler annotation
* Exception handler will return a ResponseEntity
* ResponseEntity is a wrapper for the HTTP response object
* ResponseEntity provides fine-grained control to specify:

Global Exception Handlers - @ControllerAdvice
* Exception handler code is only for the specific REST controller
* Can't be reused by other controllers :-(
* We need global exception handlers
	- Promote reuse
	- Centralizes exception handling

Spring @ControllerAdvice
* @ControllerAdvice is similar to an interceptor / filter
* Pre-process requests to controllers
* Post-process responses to handle exceptions
* Perfect for global exception handling

					/mycoolapp/player/footballers/{playerId}
	REST Client		----------------------------------------->		Controller Advice	-->		REST Service
								<----------							(Exception Handler)	<--		ThrowException

Spring REST API Design
API Design Process
1. Review API requirements
2. Identify main resources / entity
3. Use HTTP methods to assign action on resource

1. Review API requirements 
Create a REST API for the Player Directory
* REST client should be able to 
	- Get list of players
	- Get a single player by id
	- Add a new player
	- Update a player
	- Delete a player

2. Identify main resources / entity
* To identify main resource / entity, look for the most prominent "noun"
* For our project it's 'Player'
* Convention is to use plural form of resource / entity : players
	/api/players

3. Use HTTP methods to assign action on resource
	HTTP Method		Endpoint					CRUD Action
	POST			/api/players				Create a new player
	GET				/api/players				Read a list of players
	GET				/api/players/{playerId}		Read a single player
	PUT				/api/players				Update an existing player
	DELETE			/api/players/{playerId}		Delete an existing player
	
Anti-Pattens
* Do Not Do This ... these are REST anti-patterns, bad practice
/api/playersList
/api/deletePlayer
/api/addPlayer
/api/updatePlayer
Don't include actions in the end point instead use HTTP methods to assign actions

/mycoolapp/football/players	

Define Services with @Service

	Player Rest Controller	<-->		Player Service		<-->			PlayerDAO 		<-->		Database					   

Purpose of Service Layer
* Service Facade design pattern
* Intermediate layer for custom business logic
* Integrate data from multiple sources (DAO/repository)

Integrate Multiple Data Sources

															<--->		Player DAO		<--->		
Player Rest Controller		<--->		Player Service 		<--->		Skill DAO		<--->		Database
															<--->		Payroll DAO		<--->	

Specialized Annotation for Services
* Spring provides the @Service annotation

											@Component
							^					^					^
							|					|					|
					 @RestController		@Repository			@Service	

* @Service applied to Service implementation
* Spring will automatically register the Service implementation through component scanning		

/mycoolapp/footballService/playersService

Spring Boot DAO : Find, Add, Update, Delete
Service Layer - Best Practice
* Best practice is to apply transactional boundaries at the service layer
* It is the service layer's responsibility to manage transaction boundaries
* For implementation code
	- Apply @Transactional on service methods
	- Remove @Transactional on DAO methods if they already exist
	  
Sending JSON to Spring REST Controller
* When sending JSON data to Spring REST Controllers
* For controller to process JSON data, need to set a HTTP request header
	- Content-type: application/json
* Need to configure REST client to send the correct HTTP request header 

/mycoolapp/footballService/playersService/1			

@RequestBody
{
    "id": 101,
    "name": "Thomas Müller",
    "country": "Germany",
    "caps": 131,
    "goals": 46
}

Rest Controller Method Partial Updates - PATCH
Problem with PUT
				{
					"id": 1,
					"caps":192
					"goals":113
				}
				PUT /mycoolapp/footballService/playersService/1		
REST Client		---------------------------------------------->		Player REST Controller
				<----------------------------------------------
				{
					"id": 1,
    				"name": null,		X
    				"country": null,	X
    				"caps": 192,
    				"goals": 113
				}

Partial Updates - Patch
* For partial updates, need to use HTTP PATCH
* Comparison
	- PUT: Replace the entire resource
	- PATCH: Modify only specified parts of resource (partial)
* Benefits of PATCH 
	- Efficiency: Reducing bandwidth by sending only partial changes
	- Flexibility: Allows multiple partial updates in a single request

Solution with PATCH
				{
					"id": 1,
					"caps":192
					"goals":113
				}
				PATCH /mycoolapp/footballService/playersService/1		
REST Client		---------------------------------------------->		Player REST Controller
				<----------------------------------------------
				{
					"id": 1,
    				"name": "Lionel Messi",
    				"country": "Argentina",
    				"caps": 192,
    				"goals": 113
				}
	
Inject Helper Class: ObjectMapper
* ObjectMapper is a helper class in the JAckson library for JSON processing
* ObjectMapper provides following support
	- Converts Java objects to JSON and vice-versa
	- Allows merging of JSON nodes
	- Provides type safety for conversions: Java <-> JSON
* The ObjectMapper is pre-configured by Spring Boot

For POST, PUT, PATCH, DELETE
We have to generate a X-CSRF-TOKEN and then add in the Headers like this

	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
Then in the Postman we need to add a Headers
	Key 			value
	X-CSRF-TOKEN	YmYfCf2UDnchFithLY2UCFQp8wAXvK-MpqadNm_dqA8ApSshB14mPs2nb0EMdRlSSaCgOmdI3mIj3ZyhwJGoAAu_zm1kkkoV

Rest Controller Method - DELETE 
/mycoolapp/footballService/playersService/102	

Spring Data JPA in Spring Boot

	Player Rest Controller	<-->		Player Service		<-->		PlayerDAO 		<-->		Database					   
																	(Spring Data JPA)

The Problem
* We saw how to create a DAO for Player
* What if we need to create a DAO for another entity?
	- Customer, Student, Product, Book ... etc
* Do we have to repeat all of the same code again???

Creating DAO
* You may have noticed a pattern with creating DAOs i.e. Most of the code is the same only difference is the entity type and primary key

	@Override
	public Player findById(int id) {
		return entityManager.find(Player.class, id);
	}								^			^	
									|			|
							 (Entity Type)(Primary Key)	
							 
I which we could tell Spring:
	Create a DAO for me, Plug in my entity type and primary key Give me all of the basic CRUD features for free
	
My Wish Diagram	
	Entity: Player		Primary Key: Integer
				findAll()
				findById(...)
				save(...)
				deleteById(...)
				...others...
Spring Data JPA is the solution!!! 		https://spring.io/projects/spring-data-jpa
* Create a DAO and just plug in your entity type and primary key
* Spring will give you a CRUD implementation for Free... like MAGIC!!
* Help to minimize boiler-plate DAO code ... yaay!!
* More than 70% reduction in code, depending on use case

JpaRepository
* Spring Data JPA provides the interface: JpaRepository
* Exposes methods (some by inheritance from parents)
	- findAll()
	- findById(...)
	- save(...)
	- deleteById(...)

Development Process
1. Extend JpaRepository interface
2. Use your Repository in your application
	No need for implementation class

Advanced Features
* Extending and adding custom queries with JPQL
* Query Domain Specific Language (Query DSL)
* Defining custom methods (low-level coding)

Spring Data REST in Spring Boot
The Problem
* We saw how to create a REST API for Player 
* Need to create REST API for another entity?
	- Customer, Student, Product, Book ...
* Do we have to repeat all of the same code again???			

I which we could tell Spring:
 Create a REST API for me, Use my existing JpaRepository (entity, primary key)
 and Give me all of the basic REST API CRUD features for free
 
Spring Data REST is the solution!!! 		https://spring.io/projects/spring-data-rest
 * Leverage your existing JpaRepository
 * Spring will give you a REST CRUD implementation for free... like Magic!!
 * Help to minimize boiler-plate REST code ... yaay!!
 * No new coding required!
 
REST API
 * Spring Data REST will expose these end points for free!
 	HTTP Method								CRUD Action
 	POST 	/employees						Create a new employee
 	GET  	/employees						Read a list of employees
 	GET  	/employees/{employeeId}			Read a single employee
 	PUT  	/employees/{employeeId}			Update an existing employee
 	DELETE	/employees/{employeeId}			Delete an existing employee
Get all these REST end points for free.
 
Spring Data REST - How does it works?
 * Spring Data REST will scan your project for JpaRepository
 * Expose REST APIs for each entity type for your JpaRepository
 
REST End points
 * By default, Spring Data REST will create end points based on entity type 
 * Simple pluralized form
 	- First character of Entity type is lower case
 	- Then just adds an "s" to the entity
 	
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{}	---->	/employees

Development Process
 1. Add Spring Data REST to your Maven POM file. That's it... Absolutely No Coding required. Spring Data REST will scan for JpaRepository

In a nut shell
 For Spring Data REST, you only need 3 items
 1. Your entity: Employee
 2. JpaRepository: EmployeeRepository extends JpaRepository
 3. Maven POM dependency for: spring-boot-starter-data-rest 

 Application Architecture
 Before																(Spring Data JPA)
 	Employee REST Controller	<--->	Employee Service	<--->	Employee Repository	<--->	Database
 
 After
 	(Spring Data REST)				(Spring Data JPA)
 		/employees			<--->	Employee Repository		<--->	Database

HATEOAS - Hypermedia As The Engine Of Application State 
 * HATEOAS uses Hypertext Application Language (HAL) data format
 * Spring Data REST end points a HATEOAS compliant
 * Hypermedia-driven sites provide information to access REST interfaces
 * Think of it as meta-data for REST data
 	https://spring.io/projects/spring-hateoas
 * Spring Data REST response using HATEOAS
 * For example REST response from: GET /employees/3
 
 {
    "name": "Mohit Gupta",
    "company": "Sunlife",
    "salary": 20,
    "email": "mohit.k.gupta@sunlife.com",
    "_links": {
        "self": {
            "href": "http://localhost:7070/mycoolapp/employee-api/employees/1"
        },
        "employee": {
            "href": "http://localhost:7070/mycoolapp/employee-api/employees/1"
        }
    }
 }
 
 * For a collection, meta-data includes page size, total elements, pages etc
 * For example REST response from: GET /employees
 
 {
    "_embedded": {
        "employees": [
            {
                "name": "Mohit Gupta",
                "company": "Sunlife",
                "salary": 20,
                "email": "mohit.k.gupta@sunlife.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:7070/mycoolapp/employee-api/employees/1"
                    },
                    "employee": {
                        "href": "http://localhost:7070/mycoolapp/employee-api/employees/1"
                    }
                }
            },
            {
                "name": "Vipul Gupta",
                "company": "LG",
                "salary": 10,
                "email": "vipul.gupta@lg.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:7070/mycoolapp/employee-api/employees/2"
                    },
                    "employee": {
                        "href": "http://localhost:7070/mycoolapp/employee-api/employees/2"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:7070/mycoolapp/employee-api/employees?page=0&size=20"
        },
        "profile": {
            "href": "http://localhost:7070/mycoolapp/employee-api/profile/employees"
        }
    },
    "page": {
        "size": 20,
        "totalElements": 2,
        "totalPages": 1,
        "number": 0
    }
 }
	 
Advanced Features of Spring Data REST
* Pagination, Sorting and Searching
* Extending and adding custom queries with JPQL
* Query Domain Specific Language (Query DSL)

For POST, PUT, PATCH and DELETE operations we have write EmployeeRESTServiceController for csrf-token
 /mycoolapp/employees/csrf-token
and then do all the above operations with the generated token

Spring Data REST Configuration, Pagination and Sorting
* By default Spring Data REST will create end points based on entity type
* Simply pluralized form
	- First character of Entity type is lower case 
 	- Then just adds an "s" to the entity
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{}	---->	/employees

Pluralized Form
* Spring Data REST pluralized form is very simple just adds an "s" to the entity 
* But The English language is very complex! Spring Data REST does not handle these special cases like
	Singular		Plural
	Goose			Geese
	Person			People
	Syllabus		Syllabi

Problem 
* Spring Data REST does not handle complex pluralized forms so in this case you need to specify plural name
* What if we want to expose a different resource name?
	- Instead of /employees ... use /members

Solution
* Specify plural name / path with an annotation 
	@RepositoryRestResource(path="members")
	public interface EmployeeRepository extends JpaRepository<Employee, Integer>{}
	
	/mycoolapp/employee-api/members

Pagination
* By default, Spring Data REST will return the first 20 elements
* Page size = 20
* You can navigate to the different pages of data using query param
	http://localhost:7070/employee-api/employees?page=0 
	http://localhost:7070/employee-api/employees?page=1 
	/mycoolapp/employee-api/members?page=0&size=3

Spring Data REST Configuration 
* Following properties available: application.properties
		Name						Description
spring.data.rest.base-path	 		Base path used to expose repository resources
spring.data.rest.default-page-size	Default size of pages
spring.data.rest.max-page-size		Maximum size of pages

Sorting
* You can sort by the property names of your entity
	- In our Employee example, we have 'Name', 'Salary', Company
* Sort by Name (Ascending is default) 	http://localhost:7070/employee-api/employees?sort=name
* Sort by Name, Descending				http://localhost:7070/employee-api/employees?sort=name,desc
* Sort by Name then Company, Ascending	http://localhost:7070/employee-api/employees?sort=name,company,asc
	/mycoolapp/employee-api/members?sort=name
	/mycoolapp/employee-api/members?sort=name,desc

Documentation REST APIs with OpenAPI and Swagger
* There is a REST API out there but we don't have any documentation
* We have to review the source code to  find end points: @GetMapping etc
* Then use Postman and CURL to call the REST API

My Wish
* I wish we could tell our application:
	- At run-time, generate API documentation
	- Inspect API end points based on Spring configurations, annotations etc.
	- Provide a web UI for accessing end points  

Springdoc To The Rescue (www.springdoc.org)
* Springdoc is separate open-source project
* Generates API documentation
* Inspects API end points based on Spring configurations, annotations etc.
* Provides a web UI for accessing end points
* No need for Postman

Springdoc - Swagger Web UI
* Springdoc provides a Swagger web UI for accessing endpoints

Documenting REST APIs
* OpenAPI is an industry standard format for documenting APIs (www.openapis.org)
* Swagger UI is a browser-based UI for interacting with your API powered by Springdoc-OpenAPI

Development Process
1. Add Maven dependency for Springdoc
2. Access Swagger UI
3. Retrieve API end points as JSON or YAML

Add Maven dependency for Springdoc
<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui -->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.8.6</version>
</dependency>

Access the Swagger UI
* By default, Swagger UI is available at:
	- http://localhost:7070/swagger-ui/index.html

Configure Custom Path for Swagger UI
 * Can configure a custom path in application.properties
	#configure custom path
	springdoc.swagger-ui.path=/my-fun-ui.html 

Retrieve API end points as JSON or YAML
* Docs for API end points available as JSON or YAML
* Useful for integration with other development tools
* Client SDK generation, API mocking, contract testing, etc
* JSON or YAML is language independent
* Can be processed by Python, Javascript, Go, C# etc
* By default, JSON docs available here
	- http://localhost:7070/v3/api-docs
* YAML docs available here
	- http://localhost:7070/v3/api-docs.yaml
* Web browser will download the YAML file
* You can view it with any text editor 

Configure Custom Path for API docs
* Can configure a custom path in application.properties
	# configure custom path
	springdoc.api-docs.path=/my-api-docs
* Access API Docs at 
	- http://localhost:7070/my-api-docs
	- http://localhost:7070/my-api-docs.yaml

Spring Boot REST API Security Overview
* Secure Spring Boot REST APIs
* Define user and roles
* Protect URLs based on role
* Store users, passwords and roles in DB (plain-text -> encrypted)

Spring Security Model
* Spring Security defines a framework for security
* Implemented using Servlet filters in the background
* Two methods of securing an application: declarative and programmatic

Spring Security with Servlet Filters
* Servlet Filters are used to pre-process / post-process web requests
* Servlet Filters can route web requests based on security logic
* Spring provides a bulk of security functionality with servlet filters 

Security Concepts
* Authentication
	- Check user id and password with credentials stored in application / database
* Authorization
	- Check to see if user has an authorized role

Declarative Security
* Define application's security constraints in configuration
	- All Java config: @Configuration
* Provides separation of concerns between application code and security

Programmatic Security
* Spring Security provides an API for custom application coding
* Provides grater customization for specific application requirements

Enabling Spring Security
* Edit pom.xml and add spring-boot-starter-security
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency> 
* This will automatically secure all end points for application

Secure End points
* Now when you access your application
* Spring Security will prompt for login with a login form, By default user name is 'user' and generated password will be available in the application's console logs. 	

Spring Security Configuration
* You can override default user name and generated password in application.properties
	spring.security.user.name=scott
	spring.security.user.password=tiger

Authentication and Authorization
* In-memory
* JDBC
* LDAP
* Custom / Pluggable
* Others...

Configuring Basic Security
	UserId		Password		Roles
	john		test123			EMPLOYEE
	mary		test123			EMPLOYEE, MANAGER
	susan		test123			EMPLOYEE, MANAGER, ADMIN

Development Process
1. Create Spring Security Configuration (@Configuration)
2. Add users, passwords and roles

Spring Security Password Storage
* In Spring Security, passwords are stored using a specific format
	{id}encodedPassword
	
	ID			Description
	noop		Plain text passwords
	bcrypt		BCrypt password hashing
	
Password Example
	{noop}test123
	
Through Postman we can access these end points
	/mycoolapp/employee-api/politicians
	Username modi
	Password test123
	
	/mycoolapp/employee-api/politicians
	Username amit
	Password test123
	
	/mycoolapp/employee-api/politicians
	Username rajnath
	Password test123

Restrict Access Based on Roles

HTTP Method		End Point							CRUD Action			Role
GET				/api/politicians					Read all			EMPLOYEE
GET				/api/politicians/{politicianID}		Read single			EMPLOYEE
POST			/api/politicians					Create				MANAGER
PUT				/api/politicians					Update				MANAGER
PATCH			/api/politicians/{politicianID}		Partial Update		MANAGER
DELETE			/api/politicians/{politicianID}		Delete				ADMIN	
		

Restricting Access to Roles
* General Syntax
	requestMatcher(<< add path to match on >>).hasRole(<< authorize role >>)
	requestMatcher(<< add HTTP METHOD to match on >>, << add path to match on >>).hasRole(<< authorize role >>)
	requestMatcher(<< add HTTP METHOD to match on >>, << add path to match on >>).hasAnyRole(<< list of authorized roles >>)
	
Authorize Requests for EMPLOYEE role
	requestMatcher(HttpMethod.GET,"/api/politicians").hasRole("EMPLOYEE")
	requestMatcher(HttpMethod.GET,"/api/politicians/**").hasRole("EMPLOYEE")
	
Authorize Requests for MANAGER role
	requestMatcher(HttpMethod.POST,"/api/politicians").hasRole("MANAGER")
	requestMatcher(HttpMethod.PUT,"/api/politicians").hasRole("MANAGER")
	
Authorize Requests for ADMIN role
	requestMatcher(HttpMethod.DELETE,"/api/politicians/**").hasRole("ADMIN")
	
We just have to write all the above conditions together.

Cross-Site Request Forgery (CSRF)
* Spring Security can protect against CSRF attacks
* Embed additional authentication data / token into all HTML forms
* On subsequent requests, web application will verify token before processing
* Primary use case is traditional web applications (HTML forms etc...) 

When to use CSRF Protection?
* The Spring Security team recommends
	- Use CSRF protection for any normal browser web requests
	- Traditional web application with HTML forms to add / modify data
* If you are building a REST API for non-browser clients
	- You may want to disable CSRF protection
* In general, not required for state less REST APIs
	- That use POST, PUT, DELETE and /or PATCH

403 ERROR with PUT REQUEST - Spring Data REST
	403 ERROR - PUT 

This is a non-issue if using code provided for this lecture @RestController
When using Spring Data REST for PUT requests the ID is on the URL
	/api/politicians/{politicianId}
As a result, need to modify the security configuration
	requestMatcher(HttpMethod.GET,"/api/politicians").hasRole("EMPLOYEE")
	requestMatcher(HttpMethod.GET,"/api/politicians/**").hasRole("EMPLOYEE")

Restrict Access Based on Roles Patch - Partial Updates

Spring Security User Accounts Stored in Database

Database Access
* So far, our user accounts were hard coded in Java source code
* We want to add database access

Recall our User Roles
	UserId		Password		Roles
	amit		test123			EMPLOYEE
	rajnath		test123			EMPLOYEE, MANAGER
	modi		test123			EMPLOYEE, MANAGER, ADMIN

Database Support in Spring Security
* Spring Security can read user account info from database
* By default, you have to follow Spring Security's predefined table schemas

		Spring Security 	JDBC Code		<------->		Database

Customize Database Access with Spring Security
* Can also customize the table schemas
* Useful if you have custom tables specific to your project / custom
* You will be responsible for developing the code to access the data.
	- JDBC, JPA/Hibernate etc...

Development Process
1. Develop SQL Script to set up database tables
2. Add database support to Maven POM file
3. Create JDBC properties file
4. Update Spring Security Configuration to use JDBC

Default Spring Security Database Schema

	users								authorities
	username VARCHAR(50)			-	username VARCHAR(50)
	password VARCHAR(50)-------------	authority VARCHAR(50)
	enabled TINYINT(1) 				-	

Develop SQL Script to set up database tables
	
Add database support to Maven POM file
	<dependency>
		<groupId>com.mysql</groupId>
		<artifactId>mysql-connector-j</artifactId>
		<scope>runtime</scope>
	</dependency>

Create JDBC properties file
	#JDBC Properties
	spring.datasource.url=jdbc:mysql://localhost:3306/student_tracker
	spring.datasource.username=springstudent
	spring.datasource.password=springstudent
	
Update Spring Security Configuration to use JDBC

Spring Boot REST API Security - BCrypt Encryption
Password Storage
* The best practice is store passwords in an encrypted format
	username	password						enabled
	amit		{bcrypt}asdfa224asfHHS			1
	rajnath		{bcrypt}asdfa224asfHHS			1
	modi		{bcrypt}asdfa224asfHHS			1

Spring Security Team Recommendation
* Spring Security recommends using the popular bcrypt algorithm
* bcrypt
	- Performs one way encrypted hashing
	- Adds a random salt to the password for additional protection
	- Includes support to defeat brute force attacks

How to Get a Bcrypt Password
* You have a plaintext password and you want to encrypt using bcrypt
	- Option 1: Use a website utility to perform the encryption
	- Option 2: Write Java code to perform the encryption

How to get a Bcrypt password - Web site
* Visit https://www.bcryptcalculator.com/
* Enter your plain text password
* The web site will generate a bcrypt password for you.

Enter a password for hashing : test123
Password hash result : $2a$10$9j5Q1pVEmoICGZqOYUw/OeGW9MbnvZyec5bux4sfYCXmpgViU6jni

Development Process
1. Run SQL Script that contains encrypted passwords
2. Modify DDL for password field, length should be 68
	That's it.. no need to change Java source code :-)

Spring Security Password Storage
* In Spring Security, passwords are stored using a specific format
	{bcrypt}encodedPassword
	
	Note* : Password column must be at least 68 char wide
	 {bcrypt} 			- 8 chars
	 encodedPassword	- 60 chars

Spring Security Login Process

					User enter plain text password
	REST Client --------------------------------------	Spring Security 		--------->		Database
				<-------------------------------------		Filters				----------

1. Retrieve password from database for the user
2. Read the encoding algorithm id (bcrypt etc)
3. For case of bcrypt, encrypt plain text password from login form (using salt from database password)
4. compare encrypted password from login form WITH encrypted password from database
5. If there is a match, login successful
6. If no match, login Not successful
	Note: The password from database is never decrypted because bcrypt is a one-way encryption algorithm
	
Spring Security Custom Tables
Custom Tables
* What if we have our own custom tables?
* Our own custom column names?

	members							roles
	user_id VARCHAR(50)			-	user_id VARCHAR(50)
	pw CHAR(68)		-------------	role VARCHAR(50)
	active TINYINT(1) 			-	
	
This is all custom Nothing matches with default Spring Security table schema

For Security Schema Customization
* Tell Spring how to query your custom tables
* Provide query to find user by user name
* Provide query to find authorities / roles by user name

Development Process
1. Create our custom tables with SQL
2. Update Spring Security Configuration
	- Provide query to find user by user name
	- Provide query to find authorities / roles by user name
	
	
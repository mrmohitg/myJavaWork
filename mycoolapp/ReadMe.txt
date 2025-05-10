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


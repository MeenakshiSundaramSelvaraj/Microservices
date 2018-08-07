# Microservices
Microservices architecture allows to avoid monolith application for large system. It provide loose coupling between collaborating processes which running independently in different environments with tight cohesion.

# Microservices Advantages
Smaller code base is easy to maintain.</br>
Easy to scale as individual component.</br>
Technology diversity i.e. we can mix libraries, databases, frameworks etc.</br>
Fault isolation i.e. a process failure should not bring whole system down.</br>
Better support for smaller and parallel team.</br>
Independent deployment</br>
Deployment time reduce
# Microservices Disadvantages
Difficult to achieve strong consistency across services</br>
ACID transactions do not span multiple processes.</br>
Distributed System so hard to debug and trace the issues.</br>
Greater need for end to end testing.</br>
Required cultural changes in across teams like Dev and Ops working together even in same team.
# Types of microservices
-Stateful microservices
-Stateless microservices
Stateless services are good candidates as the building blocks of a distributed system. As the name suggests, 
stateless microservices do not maintain session state between requests, for example, if any of the service instance is being removed, 
it does not affect the overall processing logic for the service. Distributed systems do prefer stateless microservices.


Step 1: Creating Discovery Service (Creating Eureka Discovery Service)

	http://localhost:8110/
	
Step 2: Creating User MicroService

Step 3: Client Service

	http://localhost:8080/ 
	http://localhost:8080/userList
	http://localhost:8080/userDetails?number=1

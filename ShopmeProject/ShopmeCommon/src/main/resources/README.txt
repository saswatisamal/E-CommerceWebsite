Difference between jar/war and pom packaging type?

Used for parent or aggregator projects in a multi-module Maven setup, or for managing dependency configurations. A project with pom packaging does not generate an artifact like a .jar or .war.
When you want a parent project to manage common configurations, dependencies, and plugins for child modules.

 Used to create a Java archive file (.jar) containing compiled classes and resources for libraries or standalone Java applications.
 When you want to create a reusable library, a standalone application, or any project that will generate a .jar file.


Difference between controller and rest controller 
Used to define a controller in an MVC (Model-View-Controller) architecture. It is responsible for returning views (UI templates).
When a method is annotated with @Controller, the return value is resolved to a view name (e.g., JSP, Thymeleaf, or HTML templates).

A specialized version of @Controller used for building RESTful web services. It combines @Controller and @ResponseBody.

The return value of the methods is serialized to JSON or XML and sent as the HTTP response body.
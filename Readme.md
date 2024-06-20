# Book Library API
``````````````````

Overview
`````````

This project is a simple RESTful API for managing a book library. It provides endpoints to create, read, update, and delete books. The application is built using Spring Boot.

Technologies Used
``````````````````
    Spring Boot: Simplifies the creation of stand-alone, production-grade Spring-based applications.

    Spring Data JPA: Provides easy integration with JPA-based data access layers, simplifying database operations.

    Lombok: Reduces boilerplate code by generating getter and setter methods automatically.

    Maria DB: A database i used for storing my books

Project Structure
``````````````````

    Controller: Manages HTTP requests and responses.

    Service: Contains the business logic and communicates with 
    the repository layer.

    Entity: Represents the data model.

    Repository: Manages data persistence and retrieval operations.

Endpoints
`````````

    POST http://localhodt:50/Book/saveBook: Saves a new book.
    PUT http://localhodt:50/Book/update/{id}: Updates an existing book by its ID.
    DELETE http://localhodt:50/Book/delete/{id}: Deletes a book by its ID.
    GET http://localhodt:50/Book/getAll: Retrieves all books.

Challenges Faced
`````````````````

    Dependency Management: Managing and configuring various dependencies such as Spring Boot, JPA, and Lombok.

    Maria db: Setting up this db to store my data was complex .
   
Additional Implementations
```````````````````````````
    Maria db: Connecting to an external database.

Running the Application
````````````````````````
    Application runs on http://localhodt:50

    Build the Project: Using Maven.

Conclusion
```````````

    This project demonstrates creating a REST API using Spring Boot. 
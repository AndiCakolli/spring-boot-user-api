# Spring Boot User Management

This is a Spring Boot application that includes a simple `User` model and a `UserController` for managing users. 

This project serves as an exercise for students at **Academia jCoders**, which was completed during class.

## Structure

- `User.java` - Represents a user with name and email properties.
- `UserController.java` - Controller for adding and retrieving users.
- `DemoApplication.java` - Entry point for the Spring Boot application.
- `UserControllerTests.java` - Unit tests for `UserController`.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring-boot-user-management.git

2. Navigate to the project directory:
   ```bash
   cd spring-boot-user-management

3. Build the project using Maven:
   ```bash
   mvn clean install
4. Run the application:
   ```bash
   mvn spring-boot:run

Test the endpoints (POSTMAN):
```bash
[
    {
        "name": "John Doe",
        "email": "john.doe@example.com"
    },
    {
        "name": "Jane Smith",
        "email": "jane.smith@example.com"
    }
]

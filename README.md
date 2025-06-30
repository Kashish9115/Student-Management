# Student Management API 🚀

A clean and functional REST API built with Spring Boot and MongoDB. Designed to manage student data effectively with full CRUD support and interactive Swagger documentation.


📋 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Data MongoDB
- SpringDoc OpenAPI (Swagger UI)

✅ Features

- CRUD operations on Student entities:
  - Fields: `id`, `firstName`, `lastName`, `email`, `gender` (enum)
  - Full create, read (by ID and all), update (PUT), and delete functionality
- `ResponseEntity` used for standard HTTP responses
- Swagger UI documentation available for exploring and testing APIs
- Modular project structure: `Entity → Repository → Service → Controller`
- Basic validation and exception handling

  
🚀 Run Locally

1. Clone the repo:  
   ```bash
   git clone https://github.com/YOUR_USERNAME/student-management-api.git
   cd student-management-api```

 2.  Ensure MongoDB is running on localhost:27017 with a studentdb database.

 3.  Run the app:
 4.  ```bash
     mvn clean spring-boot:run  ```
5. Access Swagger UI:
   http://localhost:8080/swagger-ui/index.html

   
     


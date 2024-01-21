# Login Applcation

This Login Application is created with Spring Boot Maven 3.2.1 using Java 17, designed in a MVC pattern.

In the project directory, you can run:

LoginApplication.java to start the server, its URL is http://localhost:8080.

The Application expose a login validation API - http://localhost:8080/v1/login

Upon Initilizaing, these dummy data are created in h2 embedded database (http://localhost:8080/h2-console) connected via Spring Data JPA for demo purposes as shown below:

| ID      | FIRST_NAME    | LAST_NAME  | PASSWORD   | Role     | USER_NAME |
| ------- |:--------------| :----------|:-----------| :--------| :---------|
| 1       | Raymond       | Welt       | user       | USER     | user      |
| 2       | Kenny         | Reid       | manager    | MANAGER  | manager   |
| 3       | 俊豪          | 李         | 員工        | USER     | 員工      |
| 4       | 榮耀          | 陳         | 經理        | MANAGER  | 經理      |

The login credential to h2 embedded database is:
User Name: username
Password: password

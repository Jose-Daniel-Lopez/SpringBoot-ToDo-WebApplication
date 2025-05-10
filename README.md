# Todo-Web-App

A simple and modern web-based Todo application built with Spring Boot, JPA, Lombok, Thymeleaf, Bootstrap 5, and MySQL. This project was created as a learning exercise to explore the Spring Boot ecosystem and server-side rendering with Thymeleaf.

![App Screenshot](https://pplx-res.cloudinary.com/image/upload/v1746878024/user_uploads/64829762/7c720f66-39e0-41bd-ae68-3180154e1c51/CleanShot-2025-05-10-at-13.53.41.jpg)

---

## Features

- Add new tasks by title
- Mark tasks as completed or uncompleted
- Delete tasks
- Real-time counter for completed and incomplete tasks
- Responsive UI with Bootstrap 5
- Data persistence with MySQL (schema auto-generated)
- Clean, minimal interface

---

## Tech Stack

- **Backend:** Java 23 (works with any Java 17+ version), Spring Boot, Spring Data JPA, Lombok
- **Frontend:** Thymeleaf, Bootstrap 5
- **Database:** MySQL
- **Database Design:** MySQL Workbench

---

## Database Schema

The application auto-generates the following table:

| Column        | Type             | Description                    |
|---------------|------------------|--------------------------------|
| id            | BIGINT (Primary) | Task unique identifier         |
| is_completed  | BIT(1)           | Completion status (0/1)        |
| title         | VARCHAR(255)     | Task title                     |

---

## Endpoints

| Method & Path                | Description                           |
|------------------------------|---------------------------------------|
| `GET /tasks/showAll`         | Show all tasks                        |
| `POST /tasks`                | Create a new task (by title)          |
| `GET /tasks/{id}/delete`     | Delete a task by ID                   |
| `POST /tasks/{id}/toggle`    | Toggle completion status by ID        |

---

## Requirements

- Java 17 or newer (tested on Java 23)
- Maven
- MySQL Server
- MySQL Workbench (optional, for visual DB management)

---

## Getting Started

1. **Clone the repository**
   git clone https://github.com/yourusername/Todo-Web-App.git 

2. **Configure the database**
Create a MySQL database (e.g., `todo_db`). Update your `application.properties` or `application.yml` with your database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db spring.datasource.username=your_mysql_user spring.datasource.password=your_mysql_password spring.jpa.hibernate.ddl-auto=update

3. **Build and run the application**
   mvn spring-boot:run
4. The app will be available at `http://localhost:8080/tasks/showAll`

---

## Usage

- Add a new task using the input box and "Add" button.
- Mark tasks as completed by clicking the checkbox.
- Delete tasks using the red trash icon.
- View the count of completed and incomplete tasks at the bottom.

---

## Screenshots

![App Screenshot](https://pplx-res.cloudinary.com/image/upload/v1746878024/user_uploads/64829762/7c720f66-39e0-41bd-ae68-3180154e1c51/CleanShot-2025-05-10-at-13.53.41.jpg)
![Database Schema](https://pplx-res.cloudinary.com/image/upload/v1746877956/user_uploads/64829762/31d9b73a-0318-48df-ae94-704f5398ee87/CleanShot-2025-05-10-at-13.52.32-2x.jpg)

---

## License

This project is open for everyone to use, modify, and share. No license or contract applies.

---

## Author

Created for learning purposes with Spring Boot and Thymeleaf.


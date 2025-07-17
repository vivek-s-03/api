# ✅ Todo REST API with Kotlin, Spring Boot & PostgreSQL

This is a simple **RESTful CRUD API** built using **Kotlin**, **Spring Boot**, and **PostgreSQL**.  
It manages Todo tasks and demonstrates the **MVC architecture** with proper layering (Controller, Service, Repository).

---

## 🚀 Features

- Create a new Todo
- Get all Todos
- Mark Todo as completed
- Delete a Todo
- PostgreSQL database integration
- RESTful API using Spring Boot and Kotlin

---

## 🧱 Tech Stack

- Kotlin
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Gradle

---

## 📁 Project Structure

```

src/main/kotlin/com/example/demo/
├── controller      // REST Controllers
│   └── TodoController.kt
├── service         // Business logic
│   └── TodoService.kt
├── repository      // JPA Repository
│   └── TodoRepository.kt
├── model           // Entity class
│   └── Todo.kt
└── DemoApplication.kt

````

---

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/kotlin-springboot-todo-api.git
cd kotlin-springboot-todo-api
````

### 2. PostgreSQL Setup

Make sure PostgreSQL is installed and running. Then create a database:

```sql
CREATE DATABASE demo;
```

### 3. Configure `application.properties`

Update the file located at `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/demo
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

> Replace `yourpassword` with your actual PostgreSQL password.

---

### 4. Build & Run the App

Using terminal or IntelliJ terminal:

```bash
./gradlew bootRun
```

---

## 🎯 API Endpoints

| Method | Endpoint                   | Description            |
| ------ | -------------------------- | ---------------------- |
| GET    | `/api/todos`               | Get all todos          |
| POST   | `/api/todos`               | Create a new todo      |
| PUT    | `/api/todos/{id}/complete` | Mark todo as completed |
| DELETE | `/api/todos/{id}`          | Delete a todo by ID    |

---

## 🧪 Testing with cURL

```bash
# Create a todo
curl -X POST http://localhost:8080/api/todos \
  -H "Content-Type: application/json" \
  -d '{"title": "Learn Kotlin"}'

# Get all todos
curl http://localhost:8080/api/todos

# Mark as completed
curl -X PUT http://localhost:8080/api/todos/1/complete

# Delete a todo
curl -X DELETE http://localhost:8080/api/todos/1
```

---

## 📬 Testing with Postman

1. Open Postman
2. Use the following requests:

**GET** `http://localhost:8080/api/todos`
**POST** `http://localhost:8080/api/todos`
**Body (JSON):**

```json
{
  "title": "My Todo"
}
```

**PUT** `http://localhost:8080/api/todos/1/complete`
**DELETE** `http://localhost:8080/api/todos/1`

---

## 📌 License

MIT License — free to use and modify for any purpose.

---

## 🙌 Author

**Vivek S.**
Built with ❤️ using Kotlin & Spring Boot



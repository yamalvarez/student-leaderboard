
# 🏆 Student Leaderboard API

A backend application built with **Spring Boot**, **Redis**, and deployed on **Google Cloud Run**. It provides a simple REST API to manage and rank students by score.

---

## 🚀 Features

- RESTful API with Spring Boot  
- In-memory caching using Redis  
- Dockerized for containerized deployment  
- Deployed to Google Cloud Run  
- Clean code with layered architecture  

---

## 📦 Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Redis  
- Docker  
- Google Cloud Platform (Cloud Run)  
- H2 In-Memory Database (for local testing)  

---

## 🛠️ API Endpoints

| Method | Endpoint           | Description                |
|--------|--------------------|----------------------------|
| GET    | `/api/students`    | Get all students           |
| POST   | `/api/students`    | Add a new student          |
| GET    | `/api/leaderboard` | Get students by top scores |

---

## 🧪 Local Development

1. Clone the repository:

```bash
git clone https://github.com/yamalvarez/student-leaderboard.git
cd student-leaderboard
```

2. Run with Maven:

```bash
mvn spring-boot:run
```

3. Access the API locally:

```
http://localhost:8080/api/students
```

---

## 🐳 Docker

1. Build the Docker image:

```bash
docker build -t student-leaderboard .
```

2. Run the Docker container:

```bash
docker run -p 8080:8080 student-leaderboard
```

---

## ☁️ Deployment (Google Cloud Run)

The app is live here:  
🔗 [https://student-api-265443320529.us-central1.run.app](https://student-api-265443320529.us-central1.run.app)

---

## 🙋‍♂️ Author

**Yasiel Alvarez**  
📫 yamalvarez89@gmail.com  
🌐 [LinkedIn](https://www.linkedin.com/in/yamalvarez)  
📁 [GitHub](https://github.com/yamalvarez)  

Java Backend Developer passionate about building scalable and secure APIs using Spring Boot, Redis, Docker, and GCP.

# Student Leaderboard API 🏆

This is a backend application built with **Spring Boot**, **Redis**, and deployed using **Docker** to **Google Cloud Run**. It provides a simple API to manage and rank students by score.

## 🚀 Features

- RESTful API with Spring Boot
- In-memory caching with Redis
- Dockerized for containerized deployment
- Deployed on Google Cloud Run
- Follows clean code and layered architecture

## 📦 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Redis
- Docker
- Google Cloud Platform (Cloud Run)
- H2 In-Memory Database (for local testing)

## 🛠️ Endpoints

| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| GET    | `/api/students`    | Get all students         |
| POST   | `/api/students`    | Add a new student        |
| GET    | `/api/leaderboard` | Get students sorted by score |

## 🧪 Local Development

1. Clone the repo:

   ```bash
   git clone https://github.com/yamalvarez/student-leaderboard.git
   cd student-leaderboard

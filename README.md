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
   
2. Run with Maven:
   mvn spring-boot:run
   
3.Access the API locally:
   http://localhost:8080/api/students

   🐳 Docker
      1.Build the Docker image:
         docker build -t student-leaderboard .
      2.Run the Docker container:      
         docker run -p 8080:8080 student-leaderboard

    ☁️ Cloud Deployment (GCP)     
       App deployed on Google Cloud Run:
      🔗https://student-api-265443320529.us-central1.run.app

🙋‍♂️ Author
Yasiel Alvarez
📫 yamalvarez89@gmail.com
🌐 LinkedIn
📁 GitHub      
👨‍💻 Yasiel Alvarez is a Java Backend Developer with experience in Spring Boot, Redis, Docker, and Google Cloud. Passionate about building scalable and secure APIs.

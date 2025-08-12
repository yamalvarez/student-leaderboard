Student Leaderboard API
Java | Spring Boot | PostgreSQL | Redis | Google Cloud Run | CI/CD

A backend service for managing student scores, rankings, and leaderboards.
Built with Java 17 and Spring Boot, featuring performance optimization, caching, and cloud deployment.

---

🚀 Features
Full CRUD operations for managing students and their scores

Input validation with meaningful error handling

Redis caching for fast leaderboard retrieval

Pagination support for large datasets

Swagger/OpenAPI documentation for easy API exploration

Dockerized for consistent builds and deployments

CI/CD pipelines using GitHub Actions

Cloud deployment on Google Cloud Run

🛠 Tech Stack
Java 17, Spring Boot

PostgreSQL (primary database)

Redis (caching layer)

Swagger/OpenAPI (API documentation)

Docker

Google Cloud Run (deployment)

GitHub Actions (CI/CD)  

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

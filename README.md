# 🍬 Sweet Shop Management System  
**TDD Kata – Full-Stack Application**

## 📌 Project Overview
The Sweet Shop Management System is a full-stack web application designed using Test-Driven Development (TDD) principles.  
It enables users to browse, purchase, and manage sweets while enforcing role-based access control for administrative operations.

This project demonstrates skills in:
- Backend API development
- Secure authentication & authorization (JWT)
- Database design & migrations
- Frontend SPA development
- Automated testing
- Clean coding practices
- Responsible AI-assisted development

---

## 🎯 Objective
The goal of this kata is to design, build, and test a complete Sweet Shop Management System that adheres to modern software engineering standards.

---

## 🧱 Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Security (JWT)
- Spring Data JPA
- PostgreSQL
- Hibernate
- JUnit & Mockito

### Frontend
- React.js
- Axios
- React Router
- Tailwind CSS

---

## 🔐 Authentication & Authorization

- JWT-based authentication
- Stateless session management
- Role-based access control

| Role | Permissions |
|----|------------|
| USER | View, search, purchase sweets |
| ADMIN | Add, update, delete, restock sweets |

---

## 📡 API Endpoints

### Auth
- POST `/api/auth/register`
- POST `/api/auth/login`

### Sweets (Protected)
- POST `/api/sweets` (ADMIN)
- GET `/api/sweets`
- GET `/api/sweets/search`
- PUT `/api/sweets/{id}` (ADMIN)
- DELETE `/api/sweets/{id}` (ADMIN)

### Inventory
- POST `/api/sweets/{id}/purchase`
- POST `/api/sweets/{id}/restock` (ADMIN)

---

## 🧪 Test-Driven Development (TDD)

This project strictly follows Red → Green → Refactor.
- Unit tests for services
- Integration tests for controllers
- Security & authorization tests

Run tests:
```bash
mvn test
```

---

## ⚙️ Setup Instructions

### Backend
```bash
git clone https://github.com/<your-username>/sweet-shop-management.git
cd backend
mvn spring-boot:run
```

Backend runs at:
```
http://localhost:8080
```

### Frontend
```bash
cd frontend
npm install
npm start
```

Frontend runs at:
```
http://localhost:3000
```

---

## 🤖 My AI Usage

### Tools Used
- ChatGPT
- GitHub Copilot

### How AI Was Used
- API design brainstorming
- Generating boilerplate code
- Writing unit & integration tests
- Debugging Spring Security and PostgreSQL issues
- Code refactoring and cleanup

### Reflection
AI significantly improved development speed and debugging efficiency.  
All generated code was reviewed, understood, and modified manually.

---

## 📝 Git Practices
- Frequent, descriptive commits
- Clear TDD progression
- AI co-authorship added where applicable

---

## 🚀 Optional Deployment
- Backend: Render / Railway / AWS
- Frontend: Vercel / Netlify

---

## 👤 Author
Harshith Kavali  
Full-Stack Developer | Java | Spring Boot | React

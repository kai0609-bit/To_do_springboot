# ToDo Web Application

## Overview
This is a web-based ToDo application built with Spring Boot and deployed on Render.

## Features
- View all current tasks
- Add new tasks with title and description
- Edit tasks
- Delete tasks
- Toggle task status between completed and not completed
- Data persistence using PostgreSQL database

## Live Demo
https://to-do-springboot.onrender.com

## Screenshot
![ToDo App](docs/image.png)

## Requirements
- Java 21

## How to Run
```bash
.\mvnw.cmd spring-boot:run
```
Access the app at `http://localhost:8080`

## What I learned
- **Spring Boot**: Setting up a web application with Spring Boot including Controllers, Services, and Repositories.
- **MVC Architecture**: Separating responsibilities between Controller, Service, and Entity layers.
- **Thymeleaf**: Building dynamic HTML pages connected to backend data.
- **JPA / PostgreSQL**: Persisting data using Spring Data JPA with PostgreSQL on production and H2 for local development.
- **Docker**: Containerizing the application for deployment.
- **CSS**: Styling a web application with a dark theme using CSS variables.
- **Deployment**: Deploying a Spring Boot application to Render.
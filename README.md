# fit-ease-pwr — Backend (Spring Boot + MySQL Docker)

## What is this?
- **Spring Boot** = Java backend server (HTTP) → http://localhost:8080  
- **MySQL** = database (Docker) → localhost:3306  
- **Docker** = runs MySQL the same way on Mac + Windows  
- **Maven Wrapper (`mvnw`)** = run without installing Maven

---

## Requirements (install once)
- Git
- Java 17+ (`java -version`)
- Docker Desktop (`docker --version`)

---
## 1 Clone
bash
git clone https://github.com/EfranFenris/fit-ease-pwr.git
cd fit-ease-pwr/backend 

## Quickstart




## Start DB

docker compose up -d
docker ps 


## Create tables

docker exec -i fitease_mysql mysql -u fitease -pfitease fitease < schema.sql
docker exec -it fitease_mysql mysql -u fitease -pfitease -e "USE fitease; SHOW TABLES;"

## Run Backeend

# Mac
chmod +x mvnw
./mvnw spring-boot:run

# Windows (power shell)
.\mvnw.cmd spring-boot:run

# 5 Check

Open: http://localhost:8080/  → should show Hello World!

# El único problema típico en Windows/Mac:
	•	“Port 3306 already in use” → cambiar a 3307:3306 en docker-compose.yml y actualizar la URL en Spring a localhost:3307.

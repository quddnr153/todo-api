# TODO API

>  Front-end 예제 프로젝트를 위한 back-end todo api 

## SPEC

- Java 11
- Spring Boot 2.1.5.RELEASE
- JPA and H2 db
- Lombok

## 제공 API

- GET: /todos
- GET: /todos/{:id}
- POST: /todos

body: 
```json
{
  "title": "string",
  "description": "string",
  "priority": "int",
  "status": "string"
}
```

- PUT: /todos

body: 
```json
{
  "id": "long",
  "title": "string",
  "description": "string",
  "priority": "int",
  "status": "string"
}
```

## USAGE

- `mvn clean package`
- `java -jar target/todo-api-0.0.1-SNAPSHOT.jar`

## DB

- local DB console: http://localhost:9090/h2-console
- url: `jdbc:h2:mem:todoapi`
- username: `todo_api`


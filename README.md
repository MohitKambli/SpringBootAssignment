# Item Management System
A simple Spring Boot REST API for managing items using JPA and MySQL.

## Setup Instructions
### Clone the repository
```
git clone <repo_url>
cd <repo_name>
```

### Configure Database
Configure MySQL database in `application.properties` or `application.yml` file

### Install Dependencies
```
mvn clean install
```

### Run the Application
```
mvn spring-bot:run
```

## API Endpoints
| Method  | Endpoint | Description |
| ------------- | ------------- | ------------- |
| POST  | /items  | Create an item  |
| GET  | /items  | Get all items  |
| GET  | /items/{id}  | Get item by ID  |
| PUT  | /items/{id}  | Update an item  |
| PUT  | /items/{id}  | Delete an item  |

## Usage

### Create an item
```
Method: POST
URL: http://localhost:8080/items
Headers:
{
  "Content-Type": "application/json"
}
Body (raw, JSON):
{
  "name": "Laptop",
  "description": "Gaming laptop",
  "quantity": 10,
  "price": 999.99
}
```

### Get All Items
```
Method: GET
URL: http://localhost:8080/items
Headers:
{
  "Content-Type": "application/json"
}
```

### Get Item by ID
```
Method: GET
URL: http://localhost:8080/items/1
Headers:
{
  "Content-Type": "application/json"
}
```

### Update an item
```
Method: PUT
URL: http://localhost:8080/items/1
Headers:
{
  "Content-Type": "application/json"
}
Body (raw, JSON):
{
  "name": "Laptop",
  "description": "Updated gaming laptop",
  "quantity": 15,
  "price": 1099.99
}
```


### Delete an item
```
Method: DELETE
URL: http://localhost:8080/items/1
Headers:
{
  "Content-Type": "application/json"
}
```


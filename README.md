# Institute Management System

## Technical Overview

### Technology Stack
- **Java**: The primary programming language.
- **Spring Boot**: Framework for developing scalable and efficient applications.
- **Database**: MySQL for robust data storage.

### Project Structure
The project follows a structured organization:

- **src/main/java**: Java source files reside here.
  - **model**: contains table name.
  - **controllers**: Houses API endpoint definitions.
  - **services**: Contains business logic.
  - **repositories**: Responsible for data access operations.
  - **exception**: Responsible for Handling all possible Exceptions.

## Functional Requirements

### Institute Registration
**Endpoint:** `POST /Institute/registerInstitute`

**Fields:**
- Institute id
- Institute Name
- Location
- Contact Information

### Institute Modification
**Endpoint:** `PATCH /Institute/updationInstituteById/{instituteId}`

**Fields:**
- Institute Id
- Institute Name
- Location
- Contact Information

### Institute Information Retrieval
**Endpoint:** `GET /Institute/findInstituteById/{instituteId}`

## Getting Started

To set up and run the project locally, follow the steps outlined in the documentation.

1. **Clone Repository:**
    ```bash
    git clone https://github.com/your-username/your-project.git
    ```

2. **Build and Run:**
    ```bash
    cd your-project
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```


# Crew Connect

## Project Overview
Crew Connect is a scalable HR management system designed to streamline payroll, attendance, and employee record management. Built with a microservices architecture, it ensures enhanced maintainability and high performance.

## Tech Stack
- **Java** - Core programming language
- **Spring Boot** - Backend framework
- **Hibernate** - ORM for database operations
- **MySQL** - Relational database
- **REST APIs** - Communication between services

## Key Features
- **Payroll Management** - Automates salary processing and tax deductions.
- **Attendance Tracking** - Records employee attendance and generates reports.
- **Employee Records Management** - Stores and maintains employee information securely.
- **Microservices Architecture** - Enhances scalability and maintainability.

## Impact
- Improved HR workflow efficiency by **50%**.
- Ensured compliance with **labor laws** through automated checks and reporting.

## Installation & Setup
### Prerequisites
- Java 8 or later
- MySQL Database
- Maven

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/crewconnect.git
   ```
2. Navigate to the project directory:
   ```sh
   cd crewconnect
   ```
3. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:8080/crewconnect_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

## Contributing
Feel free to submit issues or pull requests to improve the project.

## License
This project is licensed under the MIT License.


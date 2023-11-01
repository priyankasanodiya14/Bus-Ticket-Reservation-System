

# YatraSarthi

Welcome toYatraSarthi, your one-stop solution for bus ticket booking. YatraSarthi bus reservation system is a state-of-the-art Spring Boot application designed to revolutionize the way customers book and purchase bus tickets online. With a focus on delivering a personalized, user-friendly experience, our platform brings convenience, efficiency, and reliability to the world of bus travel.
## About YatraSarthi

YatraSarthi is designed with the following key features:

### Admin Panel

- **Bus Management**: Administrators can easily add new bus details, including routes, schedules, and other relevant information.
- **Route Management**: Efficiently create and manage bus routes, ensuring accurate and up-to-date route information.
- **Bus Deletion**: Admins have the capability to remove buses from the system when necessary, maintaining a clean and updated database.

### User Account Creation

- **User Registration**: Users can securely create their accounts, providing personal information for future bookings.
- **Ticket Booking**: The platform offers a convenient ticket booking process, allowing users to choose their preferred routes, seats, and schedules.
- **Ticket Cancellation**: Users have the flexibility to cancel their booked tickets, adhering to defined cancellation policies.

YatraSarthi aims to streamline the bus ticket booking experience, making it hassle-free for users while providing administrators with the tools they need to manage the service effectively. This project embodies teamwork and a commitment to enhancing the user experience in the world of bus travel.

## Tech Stack

YatraSarthi is built using the following technologies:

- Java
- Hibernate
- Spring Framework
- Spring Security
- MySQL
- Maven
- Swagger UI
- Lombok
- HTML
- CSS
- JavaScript

## Modules

- **Login Module**
- **Admin Module**
- **Operator Module**
- **Customer Module**

## Prerequisites

Before running BookBusBindaas locally, ensure you have the following prerequisites installed:
- Java 8 or higher
- Maven
- MySQL Server

## Installation & Run

To run this project locally:

1. Clone the repository and navigate to the directory:

2. Configure your MySQL credentials in `application.properties` located in the `src/main/resources` directory. Replace with your actual MySQL credentials:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

3. Use Maven to build the project:

   ```shell
   mvn clean install
   ```

4. After a successful build, navigate to the `target` directory and run the JAR file:

   ```shell
   java -jar target/decisive-iron-5903-0.0.1-SNAPSHOT.jar
   ```

5. Your application should be up and running at [http://localhost:8080](http://localhost:8080).

## API Root Endpoint


Feel free to explore and enjoy the convenience of bus ticket booking with YatraSarthi!



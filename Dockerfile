# Use an official OpenJDK image as the base
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/nuo-backend.jar app.jar

# Note: No EXPOSE since the port is random (server.port=0)

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

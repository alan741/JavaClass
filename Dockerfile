# Use OpenJDK 11 as the base image
FROM azul/zulu-openjdk:21-latest

# Metadata as a label
LABEL authors="nld-alanm"

WORKDIR /app

# Copy the application JAR into the container
COPY target/PetApp-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "/app/app.jar"]
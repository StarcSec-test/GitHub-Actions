# Stage 1: Build the JAR
FROM maven:3.8.8-eclipse-temurin-11 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR
FROM eclipse-temurin:11-jre-alpine
WORKDIR /app
# Copy the compiled jar from the build stage
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
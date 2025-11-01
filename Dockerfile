## Build Stage
FROM eclipse-temurin:17-jdk-alpine AS builder
# Set working directory for the build
WORKDIR /app

# Copy source code and build files
COPY . .

# Package the application (using Maven as an example)
# Replace 'mvn package' with your build tool command (e.g., 'gradle build')
RUN ./mvnw clean package -DskipTests

## Final Stage
FROM eclipse-temurin:17-jre-alpine # Use the smaller JRE-only image for the final app 
# Set working directory
WORKDIR /app

# Copy the built JAR from the 'builder' stage
# This assumes your build generates a JAR with a name like 'your-app-version.jar'
# You may need to inspect the 'builder' stage's /app/target directory to get the exact name.
# Or, if your build is a Spring Boot app using the standard plugin, you can reference the final JAR name.
COPY --from=builder /app/target/*.jar app.jar 

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

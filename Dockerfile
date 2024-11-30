
# Stage 1: Build
FROM maven:3.8.7 AS build
WORKDIR /app
COPY . .
RUN mvn -B clean package -Dmaven.test.skip=true
RUN ls -lh /app/target

# Stage 2: Runtime
FROM openjdk:17-slim
WORKDIR /app
COPY --from=build /app/target/*.jar /app/e-rental.jar
EXPOSE 9090  # Update the exposed port to 9090
ENTRYPOINT ["java", "-jar", "/app/e-rental.jar"]

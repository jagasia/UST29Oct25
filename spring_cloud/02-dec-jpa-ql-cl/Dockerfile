# ---------- Build stage ----------
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# Cache deps
COPY pom.xml .
RUN mvn -q -e -DskipTests dependency:go-offline

# Build
COPY src ./src
RUN mvn -q -DskipTests package

# ---------- Run stage ----------
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copy jar (assumes only one jar in target)
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8081

# Optional: make container startup a bit faster / safer
ENTRYPOINT ["java","-XX:+UseContainerSupport","-jar","/app/app.jar"]

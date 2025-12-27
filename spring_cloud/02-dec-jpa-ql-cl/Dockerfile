# ---- Build stage ----
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# Copy pom first to leverage Docker layer caching
COPY pom.xml .
RUN mvn -q -e -DskipTests dependency:go-offline

# Copy source and build
COPY src ./src
RUN mvn -q -DskipTests clean package

# ---- Run stage ----
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copy the built jar (adjust if your jar name differs)
COPY --from=build /app/target/*.jar app.jar

# Optional: JVM defaults (safe for containers)
ENV JAVA_OPTS="-XX:MaxRAMPercentage=75"

EXPOSE 8081

# Run
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]

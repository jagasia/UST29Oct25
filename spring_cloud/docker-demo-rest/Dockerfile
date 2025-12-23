FROM eclipse-temurin:21-jdk
VOLUME /tmp
EXPOSE 5000
ADD target/docker-demo-rest-0.0.1-SNAPSHOT.jar jag.jar
ENTRYPOINT ["java","-jar","jag.jar"]
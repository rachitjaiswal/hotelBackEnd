FROM maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTest
FROM openjdk:21.0.1-jdk-slim
COPY --from=build /target/ho-0.0.1-SNAPSHOT.jar ho.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ho.jar"]
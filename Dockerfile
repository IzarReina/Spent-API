FROM maven:3.8.6-openjdk-11 AS build
RUN mvn clean install
FROM openjdk:11-jre-slim
COPY ./SPENT-API
CMD ["java", "-jar", "/SPENT-API/src/main/SpentApplication.java"]
WORKDIR /SPENT-API

FROM openjdk:17-jdk-alpine
MAINTAINER matija.korman@gmail.com
COPY target/gardenio-0.0.1-SNAPSHOT.jar gardenio.jar
ENTRYPOINT ["java","-jar","/gardenio.jar"]
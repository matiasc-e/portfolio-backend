FROM amazoncorretto:17-alpine-jdk
MAINTAINER MTI
COPY target/mti-0.0.1-SNAPSHOT.jar mti-app.jar
ENTRYPOINT ["java","-jar", "/mti-app.jar"]
EXPOSE 8080
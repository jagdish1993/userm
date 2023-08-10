FROM openjdk:17

WORKDIR /app

COPY target/userm-0.0.1.jar /app/userm-restful-webservices.jar

ENTRYPOINT ["java", "-jar", "userm-restful-webservices.jar"]
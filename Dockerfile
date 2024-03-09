
FROM openjdk:8

WORKDIR /security
COPY target/security-1.0.jar security.jar

EXPOSE 9090
CMD ["java", "-jar", "security.jar"]


FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/helloworld-0.0.1-SNAPSHOT.jar hello.jar
ENTRYPOINT ["java", "-jar", "/hello.jar"]
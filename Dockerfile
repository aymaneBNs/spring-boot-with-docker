FROM openjdk:8
ADD /target/spring-boot-with-docker-0.0.1-SNAPSHOT.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]
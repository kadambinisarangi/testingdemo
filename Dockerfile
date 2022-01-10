FROM openjdk:11
ADD docker-spring-boot1.jar docker-spring-boot1.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","docker-spring-boot1.jar"]
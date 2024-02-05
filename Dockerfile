FROM openjdk:21
LABEL maintainer="forumapp"
ADD target/forumApp-0.0.1-SNAPSHOT.jar docker-forum.jar
CMD ["java", "-jar", "docker-forum.jar"]

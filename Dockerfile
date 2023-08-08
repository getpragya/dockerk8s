#java 17 as base image.
FROM openjdk:17
#specify a mount point, a volumn within container.
VOLUME /temp
EXPOSE 8080
#copy files/directories into a docker image.
ARG JAR_FILE=build/libs/dockerk8s-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
#execut instructions
ENTRYPOINT ["java","-jar","/app.jar"]
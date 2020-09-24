FROM openjdk-8-jdk
EXPOSE 8888
ARG JAR_FILE = /target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
MAINTAINER "sugan.softy@gmail.com"

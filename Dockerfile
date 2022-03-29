FROM openjdk:8
EXPOSE 8080
RUN cp /target/docker-jenkins-integration-sample.jar /home/jenkins/docker-jenkins-integration-sample.jar
CMD ["java","-jar","/home/jenkins/docker-jenkins-integration-sample.jar"]

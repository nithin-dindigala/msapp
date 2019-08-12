FROM openjdk:8
EXPOSE 8080
ADD /target/msapp-0.0.1-SNAPSHOT.jar msapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "msapp-0.0.1-SNAPSHOT.jar"]
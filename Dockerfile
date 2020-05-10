FROM openjdk:8-alpine
ADD target/chuck-norris-app-1.0-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar chuck-norris-app-1.0-SNAPSHOT.jar
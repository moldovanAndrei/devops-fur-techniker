FROM docker.io/adoptopenjdk:11-jre-hotspot
COPY target/msg-demo-1.0-SNAPSHOT.jar docker-app.jar

ENTRYPOINT exec java -jar docker-app.jar
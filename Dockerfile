FROM docker.io/adoptopenjdk:11-jre-hotspot
COPY target/msg-demo-1.0-SNAPSHOT.jar app.jar
EXPOSE 8091

ENTRYPOINT exec java -jar app.jar
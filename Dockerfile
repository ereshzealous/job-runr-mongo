FROM openjdk:11.0.13
ADD build/libs/*.jar app.jar
ENTRYPOINT java ${JAVA_OPTS} -jar app.jar
EXPOSE 8000 8080
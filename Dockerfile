FROM openjdk:17

VOLUME /tmp

EXPOSE 8080

COPY target/supermercado-0.0.1-SNAPSHOT.jar supermercado.jar

ENTRYPOINT ["java", "-jar", "supermercado.jar"]

# docker build -t demo-container .
# docker run -p 8080:8080 -d demo-container
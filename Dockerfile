FROM eclipse-temurin:21
WORKDIR /home
COPY ./target/arithmetic-service-0.0.1-SNAPSHOT.jar arithmetic-service.jar
ENTRYPOINT ["java","-jar","arithmetic-service.jar"]
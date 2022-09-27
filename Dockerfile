FROM openjdk:17
ADD target/MileStone6-0.0.1-SNAPSHOT.jar MileStone6-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/MileStone6-0.0.1-SNAPSHOT.jar"]
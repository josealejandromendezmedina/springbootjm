FROM openjdk:11-jdk-slim
VOLUME /tmp
ADD DBSearcher/target/spring-boot-ms-sql-1.0-SNAPSHOT.war app.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]
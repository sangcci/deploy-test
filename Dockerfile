# build
FROM openjdk:11-jdk

WORKDIR /app

COPY build/libs/deploy-test-0.0.1-SNAPSHOT.jar /app/

# runtime
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/deploy-test-0.0.1-SNAPSHOT.jar", "> /home/ec2-user/spring.log", "2>&1", "< /dev/null &"]

FROM gradle:7-jdk17 AS build
COPY --chown=gradle:gradle .. /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle test --no-daemon
RUN gradle buildFatJar --no-daemon

FROM openjdk:17
EXPOSE 8080:8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/gday-world-ktor.jar
ENTRYPOINT ["java","-jar","/app/gday-world-ktor.jar"]
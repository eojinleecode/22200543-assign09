
FROM azul/zulu-openjdk:23.0.2-jdk AS build

WORKDIR /app

COPY gradlew build.gradle settings.gradle ./
COPY gradle ./gradle
COPY src ./src

RUN chmod +x ./gradlew
RUN ./gradlew clean bootJar -x test --no-daemon

FROM azul/zulu-openjdk:23.0.2-jdk

WORKDIR /app

COPY --from=build /app/build/libs/*-SNAPSHOT.jar app.jar

EXPOSE 10000

ENTRYPOINT ["java", "-jar", "app.jar"]

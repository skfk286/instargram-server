FROM amazoncorretto:17

ARG JAR_FILE=./build/libs/instargram-server-0.0.1-SNAPSHOT.jar

WORKDIR /app

COPY ${JAR_FILE} /app/instargram.jar

CMD ["java", "-Duser.timezone=Asia/Seoul", "-jar", "instargram.jar"]
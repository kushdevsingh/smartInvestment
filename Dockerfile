## Check the Git branch

FROM adoptopenjdk:11-jre-hotspot as builder
# Add Maintainer Info
LABEL maintainer="kushdev@gmail.com"
EXPOSE 8080

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

#COPY --from=builder dependencies/ ./
#COPY --from=builder snapshot-dependencies/ ./
#COPY --from=builder spring-boot-loader/ ./
#COPY --from=builder application/ ./
#ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
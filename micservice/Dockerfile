FROM openjdk:8-jdk

ENV TZ=Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY micservice-0.0.1-SNAPSHOT.jar /home/micservice.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/micservice.jar","--spring.profiles.active=prod"]

EXPOSE 8080
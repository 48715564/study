FROM openjdk:8-jdk

ENV TZ=Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY zuul-0.0.1-SNAPSHOT.jar /home/zuul.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/zuul.jar","--spring.profiles.active=prod"]

EXPOSE 2222
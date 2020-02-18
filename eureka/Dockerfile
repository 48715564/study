FROM openjdk:8-jdk

ENV TZ=Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY eureka-0.0.1-SNAPSHOT.jar /home/eureka.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/eureka.jar"]

EXPOSE 8761
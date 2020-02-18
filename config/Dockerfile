FROM openjdk:8-jdk

ENV TZ=Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY config-0.0.1-SNAPSHOT.jar /home/config.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/config.jar","--eureka.client.serviceUrl.defaultZone=http://192.168.172.131:8761/eureka/"]

EXPOSE 8888
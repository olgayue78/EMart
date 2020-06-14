From java:openjdk-8

MAINTAINER olgayue

ADD ./eureka-server-0.0.1-SNAPSHOT.jar /home/eureka-server-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/eureka-server-0.0.1-SNAPSHOT.jar"]

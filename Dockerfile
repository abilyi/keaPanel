FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.7_10_openj9-0.10.0-alpine-slim
COPY target/kea-control-*.jar kea-control.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-XX:+IdleTuningGcOnIdle", "-Xtune:virtualized", "-jar", "kea-control.jar"]

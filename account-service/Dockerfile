#Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="hamza.com"
# Add the application's jar to the image
COPY target/account-service-1.0.0.jar account-service-1.0.0.jar
# execute the application
ENTRYPOINT ["java", "-jar", "account-service-1.0.0.jar"]

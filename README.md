
# Spring Boot demo project to demonstrate rate limiting for API's to avoid DDoS by IP

**Packages used** - Bucket4j-starter, Ehcache

*Reference 1* - https://www.baeldung.com/spring-bucket4j
*Reference 2* - https://github.com/MarcGiffing/bucket4j-spring-boot-starter#bucket4j-properties

Refer application.properties for different configurations of Bucket4j used

Developed and tested in Java 8

To build the JAR file - Run `mvn clean package` - This will create a JAR in `/target`

To run the JAR file - Run `java -jar RateLimiter-0.0.1-SNAPSHOT.jar`



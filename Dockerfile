FROM rsnair2/jdk1.8.0_25

ENV APP_PORT=8080
COPY ./target/spring-boot-web-wildfly-search-*.jar ./spring-boot-web-wildfly-search.jar

CMD exec java $JAVA_OPTS -jar ./spring-boot-web-wildfly-search.jar --server.port=$APP_PORT
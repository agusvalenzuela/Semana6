FROM openjdk:21-ea-24-oracle
WORKDIR /app
COPY target/atencionmedica-0.0.1-SNAPSHOT.jar app.jar
COPY Wallet_DY8ADCZJRLUWZ438 /app/oracle_wallet
EXPOSE 8080
CMD ["java". "-jar", "app.jar"]
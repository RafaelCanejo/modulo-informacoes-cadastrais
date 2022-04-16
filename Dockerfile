FROM maven:3.8.2-jdk-8
WORKDIR /modulo-informacoes-cadastrais
COPY . .
EXPOSE 8083
RUN mvn clean install -DskipTests
CMD mvn spring-boot:run
FROM maven:3.6-jdk-13-alpine

RUN apk add --no-cache asciidoctor hugo make

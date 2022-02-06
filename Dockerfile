FROM openjdk:17

WORKDIR /opt/app

COPY PrimeSieve.java run.sh ./

ENTRYPOINT [ "./run.sh" ]
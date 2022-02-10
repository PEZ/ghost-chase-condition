FROM openjdk:17-bullseye

WORKDIR /opt/app

RUN apt-get update -y && apt-get install -y numactl

COPY PrimeSieve.java run.sh ./

ENTRYPOINT [ "./run.sh" ]
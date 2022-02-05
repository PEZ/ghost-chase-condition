#!/bin/bash

javac PrimeSieve.java

RUNS=$(if [ -z "$1" ]; then echo 10; else echo "$1"; fi)
for ((i = 0; i < RUNS; i++))
do
  echo "=== BEGIN RUN $i ==="
  java PrimeSieve
  #java -XX:+PrintCompilation PrimeSieve
  echo "=== END RUN $i ==="
done
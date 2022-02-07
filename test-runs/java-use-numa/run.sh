#!/bin/bash

javac PrimeSieve.java

RUNS=$(if [ -z "$1" ]; then echo 100; else echo "$1"; fi)
for ((i = 0; i < RUNS; i++))
do
  echo -n "$i - "
  java -XX:+UseNUMA PrimeSieve
done
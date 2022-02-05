# ghost-chase-condition

Following a performance-eating ghost down the JVM rabbit hole

## The Problem

When writing an implementation of the Eratosthenes sieve in Java, using `java.util.BitSet` for storage, I run into a mysterious variation in performance in Docker on a Linux x64 machine. About half of the runs perform only 0.5X of what it ”should” do.

## Reproduction

This repository contains a folder `experiments/java-bitset-perf-flicker` with these three files:

* `PrimeSieve.java`, a program that sieves `limit` numbers of numbers for primes, defaulting to 1 million
   * The program starts with sieving the numbers as many times as it can for 5 seconds as a warmup.
   * Then sieves the numbers for 5 seconds counting the number of passes.
   * Then prints the number of passes, along with a sanity check that the sieve is correctly updated.
   * The BitSet is recreated each pass.
* `run.sh`, a script that will compile `PrimeSieve.java` and run it X times. X defaults to 10.
* `Dockerfile`, a docker image definition based on `openjdk:17` that when run will run `run.sh` then exit.

To run the reproduction:

```sh
$ cd experiments/java-bitset-perf-flicker
$ docker build -t primes-java-bitset  . && docker run --rm -it primes-java-bitset
```

On my Mac M1, I get the following output:

```
=== BEGIN RUN 0 ===
Passes: 3748, count: 78498, Valid: true
=== END RUN 0 ===
=== BEGIN RUN 1 ===
Passes: 3748, count: 78498, Valid: true
=== END RUN 1 ===
=== BEGIN RUN 2 ===
Passes: 3747, count: 78498, Valid: true
=== END RUN 2 ===
=== BEGIN RUN 3 ===
Passes: 3740, count: 78498, Valid: true
=== END RUN 3 ===
=== BEGIN RUN 4 ===
Passes: 3737, count: 78498, Valid: true
=== END RUN 4 ===
```

On a Linux x64 machine I have I get the following output:
```
```
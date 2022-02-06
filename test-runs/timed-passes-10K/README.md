# Sieve test run 60s

* **Sieve limit**: 1000000
* **Passes**: 10000
* **Runs**: 10
* **JDK/JVM**: 17/17

Here we run the sieve 10,000 passes and measure the time it takes. There is no warmup involved here.

* **Hypothesis**: `System.currentTimeMillis()` has flaky performance characteristics.
* **Results**: Falsified.

## Results: [pez-x64-ubuntu](../../machine-pez-x64-ubuntu.md)

### `docker build -t primes-java-bitset  . && docker run --rm -it primes-java-bitset`

```
0 - Time: 8287, Passes: 10000, count: 78498, Valid: true
1 - Time: 18050, Passes: 10000, count: 78498, Valid: true
2 - Time: 18090, Passes: 10000, count: 78498, Valid: true
3 - Time: 8307, Passes: 10000, count: 78498, Valid: true
4 - Time: 18065, Passes: 10000, count: 78498, Valid: true
5 - Time: 18115, Passes: 10000, count: 78498, Valid: true
6 - Time: 8312, Passes: 10000, count: 78498, Valid: true
7 - Time: 18121, Passes: 10000, count: 78498, Valid: true
8 - Time: 18106, Passes: 10000, count: 78498, Valid: true
9 - Time: 18092, Passes: 10000, count: 78498, Valid: true
```

### `./run.sh`

```
0 - Time: 8484, Passes: 10000, count: 78498, Valid: true
1 - Time: 8271, Passes: 10000, count: 78498, Valid: true
2 - Time: 8275, Passes: 10000, count: 78498, Valid: true
3 - Time: 8281, Passes: 10000, count: 78498, Valid: true
4 - Time: 8563, Passes: 10000, count: 78498, Valid: true
5 - Time: 8303, Passes: 10000, count: 78498, Valid: true
6 - Time: 8316, Passes: 10000, count: 78498, Valid: true
7 - Time: 8329, Passes: 10000, count: 78498, Valid: true
8 - Time: 8306, Passes: 10000, count: 78498, Valid: true
9 - Time: 8291, Passes: 10000, count: 78498, Valid: true
```
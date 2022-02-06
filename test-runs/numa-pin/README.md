# NUMA pinning

* **Sieve limit**: 1000000
* **Warmup time**: 5 seconds
* **Run time**: 5 seconds
* **Runs**: 100
* **JDK/JVM**: 17/17

Pin the NVM to one NUMA node.

* **Hypothesis**: The JVM process sometimes gets scheduled accross a different NUMA node than where the heap is allocated. (Or something like that. Read [this HN thread](https://news.ycombinator.com/item?id=30231945) to not be tained by my limited understanding of the potential issue)
* **Results**: Not falsified. The runs never drop to the 0.5X-ish performance level.


## Results: [pez-x64-ubuntu](../../machine-pez-x64-ubuntu.md)

```
$ docker build -t primes-java-bitset  . && docker run --rm -it primes-java-bitset

```
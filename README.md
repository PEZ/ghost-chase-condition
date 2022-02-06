# ghost-chase-condition

Following a performance-eating ghost down the JVM rabbit hole.

Please see [this blog post](https://blog.agical.se/en/posts/java-bitset-performance-mystery) for an introduction to the mystery.

TL;DR: The same `javac` compiled program runs at two different speeds: 1X and 0.5X, on the same machine, using Docker. I've managed to create a somewhat minimal repro.

To run the repro:

```
docker build -t primes-java-bitset  . && docker run --rm -it primes-java-bitset
```

Sample output on [this machine](machine-pez-x64-ubuntu.md):

```
0 - Passes: 2767, count: 78498, Valid: true
1 - Passes: 2751, count: 78498, Valid: true
2 - Passes: 2766, count: 78498, Valid: true
3 - Passes: 2756, count: 78498, Valid: true
4 - Passes: 6049, count: 78498, Valid: true
5 - Passes: 2763, count: 78498, Valid: true
6 - Passes: 2765, count: 78498, Valid: true
7 - Passes: 2760, count: 78498, Valid: true
8 - Passes: 6043, count: 78498, Valid: true
9 - Passes: 2760, count: 78498, Valid: true
```

I'm getting some good help over at HN: https://news.ycombinator.com/item?id=30226083#30227321
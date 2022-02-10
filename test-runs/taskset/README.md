# taskset

* **Sieve limit**: 1000000
* **Warmup time**: 5 seconds
* **Run time**: 5 seconds
* **Runs**: 100
* **JDK/JVM**: 17/17

Use `taskset` to pin the JVM process to just one cpu. This command is being run:

```sh
taskset -c 0 java PrimeSieve
```

* **Hypothesis**: This is not about [NUMA](../numa-pin/), but about that the process sometimes migrating across cpus.
* **Results**: I don't know if falsified or not 😂. The runs stop flickering in their performance, but also never run at their proper speed, it is rather very reliably and stably running at 0.5X-ish performance level we see it flicker to when running the java command without any cpu or memory binding.

Maybe this means that the memory is never bound to cpu 0? (Unless we force it using `numactl --membind=0`.)

## Results: [pez-x64-ubuntu](../../machine-pez-x64-ubuntu.md)

```
$ docker build -t primes-java-bitset  . && docker run --rm -it primes-java-bitset
0 - Passes: 2750, count: 78498, Valid: true
1 - Passes: 2754, count: 78498, Valid: true
2 - Passes: 2755, count: 78498, Valid: true
3 - Passes: 2754, count: 78498, Valid: true
4 - Passes: 2745, count: 78498, Valid: true
5 - Passes: 2751, count: 78498, Valid: true
6 - Passes: 2754, count: 78498, Valid: true
7 - Passes: 2758, count: 78498, Valid: true
8 - Passes: 2741, count: 78498, Valid: true
9 - Passes: 2755, count: 78498, Valid: true
10 - Passes: 2752, count: 78498, Valid: true
11 - Passes: 2745, count: 78498, Valid: true
12 - Passes: 2762, count: 78498, Valid: true
13 - Passes: 2726, count: 78498, Valid: true
14 - Passes: 2749, count: 78498, Valid: true
15 - Passes: 2754, count: 78498, Valid: true
16 - Passes: 2757, count: 78498, Valid: true
17 - Passes: 2752, count: 78498, Valid: true
18 - Passes: 2750, count: 78498, Valid: true
19 - Passes: 2751, count: 78498, Valid: true
20 - Passes: 2740, count: 78498, Valid: true
21 - Passes: 2732, count: 78498, Valid: true
22 - Passes: 2740, count: 78498, Valid: true
23 - Passes: 2754, count: 78498, Valid: true
24 - Passes: 2749, count: 78498, Valid: true
25 - Passes: 2748, count: 78498, Valid: true
26 - Passes: 2745, count: 78498, Valid: true
27 - Passes: 2755, count: 78498, Valid: true
28 - Passes: 2708, count: 78498, Valid: true
29 - Passes: 2756, count: 78498, Valid: true
30 - Passes: 2754, count: 78498, Valid: true
31 - Passes: 2755, count: 78498, Valid: true
32 - Passes: 2749, count: 78498, Valid: true
33 - Passes: 2748, count: 78498, Valid: true
34 - Passes: 2750, count: 78498, Valid: true
35 - Passes: 2754, count: 78498, Valid: true
36 - Passes: 2756, count: 78498, Valid: true
37 - Passes: 2754, count: 78498, Valid: true
38 - Passes: 2752, count: 78498, Valid: true
39 - Passes: 2732, count: 78498, Valid: true
40 - Passes: 2752, count: 78498, Valid: true
41 - Passes: 2752, count: 78498, Valid: true
42 - Passes: 2740, count: 78498, Valid: true
43 - Passes: 2752, count: 78498, Valid: true
44 - Passes: 2754, count: 78498, Valid: true
45 - Passes: 2745, count: 78498, Valid: true
46 - Passes: 2743, count: 78498, Valid: true
47 - Passes: 2733, count: 78498, Valid: true
48 - Passes: 2747, count: 78498, Valid: true
49 - Passes: 2749, count: 78498, Valid: true
50 - Passes: 2742, count: 78498, Valid: true
51 - Passes: 2749, count: 78498, Valid: true
52 - Passes: 2758, count: 78498, Valid: true
53 - Passes: 2747, count: 78498, Valid: true
54 - Passes: 2747, count: 78498, Valid: true
55 - Passes: 2745, count: 78498, Valid: true
56 - Passes: 2746, count: 78498, Valid: true
57 - Passes: 2758, count: 78498, Valid: true
58 - Passes: 2754, count: 78498, Valid: true
59 - Passes: 2752, count: 78498, Valid: true
60 - Passes: 2749, count: 78498, Valid: true
61 - Passes: 2754, count: 78498, Valid: true
62 - Passes: 2744, count: 78498, Valid: true
63 - Passes: 2750, count: 78498, Valid: true
64 - Passes: 2753, count: 78498, Valid: true
65 - Passes: 2715, count: 78498, Valid: true
66 - Passes: 2705, count: 78498, Valid: true
67 - Passes: 2749, count: 78498, Valid: true
68 - Passes: 2751, count: 78498, Valid: true
69 - Passes: 2746, count: 78498, Valid: true
70 - Passes: 2752, count: 78498, Valid: true
71 - Passes: 2757, count: 78498, Valid: true
72 - Passes: 2758, count: 78498, Valid: true
73 - Passes: 2744, count: 78498, Valid: true
74 - Passes: 2752, count: 78498, Valid: true
75 - Passes: 2752, count: 78498, Valid: true
76 - Passes: 2755, count: 78498, Valid: true
77 - Passes: 2758, count: 78498, Valid: true
78 - Passes: 2748, count: 78498, Valid: true
79 - Passes: 2755, count: 78498, Valid: true
80 - Passes: 2755, count: 78498, Valid: true
81 - Passes: 2743, count: 78498, Valid: true
82 - Passes: 2745, count: 78498, Valid: true
83 - Passes: 2751, count: 78498, Valid: true
84 - Passes: 2749, count: 78498, Valid: true
85 - Passes: 2746, count: 78498, Valid: true
86 - Passes: 2746, count: 78498, Valid: true
87 - Passes: 2745, count: 78498, Valid: true
88 - Passes: 2745, count: 78498, Valid: true
89 - Passes: 2744, count: 78498, Valid: true
90 - Passes: 2743, count: 78498, Valid: true
91 - Passes: 2750, count: 78498, Valid: true
92 - Passes: 2749, count: 78498, Valid: true
93 - Passes: 2749, count: 78498, Valid: true
94 - Passes: 2749, count: 78498, Valid: true
95 - Passes: 2749, count: 78498, Valid: true
96 - Passes: 2751, count: 78498, Valid: true
97 - Passes: 2752, count: 78498, Valid: true
98 - Passes: 2755, count: 78498, Valid: true
99 - Passes: 2743, count: 78498, Valid: true
```
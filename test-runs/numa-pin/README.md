# NUMA pinning

* **Sieve limit**: 1000000
* **Warmup time**: 5 seconds
* **Run time**: 5 seconds
* **Runs**: 100
* **JDK/JVM**: 17/17

Pin the NVM to one NUMA node using this command line:

```sh
numactl --cpunodebind=0 --membind=0 java PrimeSieve
```

* **Hypothesis**: The JVM process sometimes gets scheduled accross a different NUMA node than where the heap is allocated. (Or something like that. Read [this HN thread](https://news.ycombinator.com/item?id=30231945) to not be tained by my limited understanding of the potential issue)
* **Results**: Not falsified. The runs never drop to the 0.5X-ish performance level.

What is a bit strange about this hypothesis is that the [machine](../../machine-pez-x64-ubuntu.md) only has one NUMA node. Might just be about how I phrase it though. Is it rather about the cpus?

## Results: [pez-x64-ubuntu](../../machine-pez-x64-ubuntu.md)

```
$ docker build -t primes-java-bitset  . && docker run --rm -it primes-java-bitset
0 - Passes: 5935, count: 78498, Valid: true
1 - Passes: 6059, count: 78498, Valid: true
2 - Passes: 5865, count: 78498, Valid: true
3 - Passes: 5914, count: 78498, Valid: true
4 - Passes: 5922, count: 78498, Valid: true
5 - Passes: 6038, count: 78498, Valid: true
6 - Passes: 5869, count: 78498, Valid: true
7 - Passes: 6031, count: 78498, Valid: true
8 - Passes: 5855, count: 78498, Valid: true
9 - Passes: 5915, count: 78498, Valid: true
10 - Passes: 5888, count: 78498, Valid: true
11 - Passes: 5864, count: 78498, Valid: true
12 - Passes: 5896, count: 78498, Valid: true
13 - Passes: 6001, count: 78498, Valid: true
14 - Passes: 5884, count: 78498, Valid: true
15 - Passes: 5896, count: 78498, Valid: true
16 - Passes: 5875, count: 78498, Valid: true
17 - Passes: 6011, count: 78498, Valid: true
18 - Passes: 5840, count: 78498, Valid: true
19 - Passes: 5905, count: 78498, Valid: true
20 - Passes: 5882, count: 78498, Valid: true
21 - Passes: 5896, count: 78498, Valid: true
22 - Passes: 5884, count: 78498, Valid: true
23 - Passes: 5860, count: 78498, Valid: true
24 - Passes: 5863, count: 78498, Valid: true
25 - Passes: 5860, count: 78498, Valid: true
26 - Passes: 5798, count: 78498, Valid: true
27 - Passes: 5858, count: 78498, Valid: true
28 - Passes: 5826, count: 78498, Valid: true
29 - Passes: 5893, count: 78498, Valid: true
30 - Passes: 5874, count: 78498, Valid: true
31 - Passes: 5877, count: 78498, Valid: true
32 - Passes: 6004, count: 78498, Valid: true
33 - Passes: 5859, count: 78498, Valid: true
34 - Passes: 5890, count: 78498, Valid: true
35 - Passes: 5900, count: 78498, Valid: true
36 - Passes: 5895, count: 78498, Valid: true
37 - Passes: 5875, count: 78498, Valid: true
38 - Passes: 5915, count: 78498, Valid: true
39 - Passes: 5916, count: 78498, Valid: true
40 - Passes: 5874, count: 78498, Valid: true
41 - Passes: 5891, count: 78498, Valid: true
42 - Passes: 6010, count: 78498, Valid: true
43 - Passes: 5866, count: 78498, Valid: true
44 - Passes: 6037, count: 78498, Valid: true
45 - Passes: 5886, count: 78498, Valid: true
46 - Passes: 5878, count: 78498, Valid: true
47 - Passes: 5857, count: 78498, Valid: true
48 - Passes: 5894, count: 78498, Valid: true
49 - Passes: 5795, count: 78498, Valid: true
50 - Passes: 6034, count: 78498, Valid: true
51 - Passes: 5856, count: 78498, Valid: true
52 - Passes: 5878, count: 78498, Valid: true
53 - Passes: 5883, count: 78498, Valid: true
54 - Passes: 5892, count: 78498, Valid: true
55 - Passes: 6021, count: 78498, Valid: true
56 - Passes: 6010, count: 78498, Valid: true
57 - Passes: 5864, count: 78498, Valid: true
58 - Passes: 6002, count: 78498, Valid: true
59 - Passes: 5847, count: 78498, Valid: true
60 - Passes: 5983, count: 78498, Valid: true
61 - Passes: 5837, count: 78498, Valid: true
62 - Passes: 5860, count: 78498, Valid: true
63 - Passes: 5866, count: 78498, Valid: true
64 - Passes: 5994, count: 78498, Valid: true
65 - Passes: 5885, count: 78498, Valid: true
66 - Passes: 6044, count: 78498, Valid: true
67 - Passes: 5879, count: 78498, Valid: true
68 - Passes: 6059, count: 78498, Valid: true
69 - Passes: 5881, count: 78498, Valid: true
70 - Passes: 5892, count: 78498, Valid: true
71 - Passes: 5844, count: 78498, Valid: true
72 - Passes: 5907, count: 78498, Valid: true
73 - Passes: 5879, count: 78498, Valid: true
74 - Passes: 5871, count: 78498, Valid: true
75 - Passes: 6023, count: 78498, Valid: true
76 - Passes: 6007, count: 78498, Valid: true
77 - Passes: 5984, count: 78498, Valid: true
78 - Passes: 6044, count: 78498, Valid: true
79 - Passes: 6043, count: 78498, Valid: true
80 - Passes: 6032, count: 78498, Valid: true
81 - Passes: 5828, count: 78498, Valid: true
82 - Passes: 5971, count: 78498, Valid: true
83 - Passes: 5865, count: 78498, Valid: true
84 - Passes: 6021, count: 78498, Valid: true
85 - Passes: 5835, count: 78498, Valid: true
86 - Passes: 5900, count: 78498, Valid: true
87 - Passes: 5904, count: 78498, Valid: true
88 - Passes: 5900, count: 78498, Valid: true
89 - Passes: 5858, count: 78498, Valid: true
90 - Passes: 5866, count: 78498, Valid: true
91 - Passes: 5869, count: 78498, Valid: true
92 - Passes: 5836, count: 78498, Valid: true
93 - Passes: 5890, count: 78498, Valid: true
94 - Passes: 5858, count: 78498, Valid: true
95 - Passes: 6000, count: 78498, Valid: true
96 - Passes: 6070, count: 78498, Valid: true
97 - Passes: 5877, count: 78498, Valid: true
98 - Passes: 6005, count: 78498, Valid: true
99 - Passes: 5877, count: 78498, Valid: true
```
# -XX:+UseNUMA

* **Sieve limit**: 1000000
* **Warmup time**: 5 seconds
* **Run time**: 5 seconds
* **Runs**: 100
* **JDK/JVM**: 17/17

Can we get rid of the `numactl` requirement?

* **Hypothesis**: We can avoid the performance flicker by using the `java` option `-XX:+UseNUMA`, instead of wrapping the java command with `numactl` as with [test-runs/numa-pin](../numa-pin)
* **Results**: Not falsified.

NB: I have now learnt that `UseNUMA` doesn't really achieve the pinning that is needed.

## Results: [pez-x64-ubuntu](../../machine-pez-x64-ubuntu.md)

```
0 - Passes: 5884, count: 78498, Valid: true
1 - Passes: 5924, count: 78498, Valid: true
2 - Passes: 5896, count: 78498, Valid: true
3 - Passes: 5908, count: 78498, Valid: true
4 - Passes: 6026, count: 78498, Valid: true
5 - Passes: 6065, count: 78498, Valid: true
6 - Passes: 5966, count: 78498, Valid: true
7 - Passes: 5891, count: 78498, Valid: true
8 - Passes: 5905, count: 78498, Valid: true
9 - Passes: 5880, count: 78498, Valid: true
10 - Passes: 5832, count: 78498, Valid: true
11 - Passes: 5848, count: 78498, Valid: true
12 - Passes: 5858, count: 78498, Valid: true
13 - Passes: 5798, count: 78498, Valid: true
14 - Passes: 5860, count: 78498, Valid: true
15 - Passes: 5856, count: 78498, Valid: true
16 - Passes: 6022, count: 78498, Valid: true
17 - Passes: 6036, count: 78498, Valid: true
18 - Passes: 5867, count: 78498, Valid: true
19 - Passes: 5878, count: 78498, Valid: true
20 - Passes: 5856, count: 78498, Valid: true
21 - Passes: 5887, count: 78498, Valid: true
22 - Passes: 5904, count: 78498, Valid: true
23 - Passes: 6029, count: 78498, Valid: true
24 - Passes: 5887, count: 78498, Valid: true
25 - Passes: 5824, count: 78498, Valid: true
26 - Passes: 5873, count: 78498, Valid: true
27 - Passes: 5845, count: 78498, Valid: true
28 - Passes: 5881, count: 78498, Valid: true
29 - Passes: 5877, count: 78498, Valid: true
30 - Passes: 5832, count: 78498, Valid: true
31 - Passes: 5834, count: 78498, Valid: true
32 - Passes: 5912, count: 78498, Valid: true
33 - Passes: 5815, count: 78498, Valid: true
34 - Passes: 5839, count: 78498, Valid: true
35 - Passes: 6001, count: 78498, Valid: true
36 - Passes: 6039, count: 78498, Valid: true
37 - Passes: 5841, count: 78498, Valid: true
38 - Passes: 5866, count: 78498, Valid: true
39 - Passes: 5907, count: 78498, Valid: true
40 - Passes: 5867, count: 78498, Valid: true
41 - Passes: 5882, count: 78498, Valid: true
42 - Passes: 5897, count: 78498, Valid: true
43 - Passes: 5868, count: 78498, Valid: true
44 - Passes: 6034, count: 78498, Valid: true
45 - Passes: 5863, count: 78498, Valid: true
46 - Passes: 5879, count: 78498, Valid: true
47 - Passes: 5830, count: 78498, Valid: true
48 - Passes: 5878, count: 78498, Valid: true
49 - Passes: 5868, count: 78498, Valid: true
50 - Passes: 5870, count: 78498, Valid: true
51 - Passes: 6008, count: 78498, Valid: true
52 - Passes: 5819, count: 78498, Valid: true
53 - Passes: 5868, count: 78498, Valid: true
54 - Passes: 5824, count: 78498, Valid: true
55 - Passes: 5984, count: 78498, Valid: true
56 - Passes: 5893, count: 78498, Valid: true
57 - Passes: 5885, count: 78498, Valid: true
58 - Passes: 6039, count: 78498, Valid: true
59 - Passes: 5897, count: 78498, Valid: true
60 - Passes: 5830, count: 78498, Valid: true
61 - Passes: 5980, count: 78498, Valid: true
62 - Passes: 5830, count: 78498, Valid: true
63 - Passes: 5862, count: 78498, Valid: true
64 - Passes: 5825, count: 78498, Valid: true
65 - Passes: 5897, count: 78498, Valid: true
66 - Passes: 5879, count: 78498, Valid: true
67 - Passes: 5884, count: 78498, Valid: true
68 - Passes: 5863, count: 78498, Valid: true
69 - Passes: 6035, count: 78498, Valid: true
70 - Passes: 6007, count: 78498, Valid: true
71 - Passes: 5843, count: 78498, Valid: true
72 - Passes: 5877, count: 78498, Valid: true
73 - Passes: 5850, count: 78498, Valid: true
74 - Passes: 5885, count: 78498, Valid: true
75 - Passes: 5869, count: 78498, Valid: true
76 - Passes: 5812, count: 78498, Valid: true
77 - Passes: 6040, count: 78498, Valid: true
78 - Passes: 5878, count: 78498, Valid: true
79 - Passes: 6021, count: 78498, Valid: true
80 - Passes: 5858, count: 78498, Valid: true
81 - Passes: 6022, count: 78498, Valid: true
82 - Passes: 5873, count: 78498, Valid: true
83 - Passes: 5875, count: 78498, Valid: true
84 - Passes: 5846, count: 78498, Valid: true
85 - Passes: 5863, count: 78498, Valid: true
86 - Passes: 6006, count: 78498, Valid: true
87 - Passes: 6027, count: 78498, Valid: true
88 - Passes: 6023, count: 78498, Valid: true
89 - Passes: 6015, count: 78498, Valid: true
90 - Passes: 5869, count: 78498, Valid: true
91 - Passes: 5969, count: 78498, Valid: true
92 - Passes: 5829, count: 78498, Valid: true
93 - Passes: 6024, count: 78498, Valid: true
94 - Passes: 5844, count: 78498, Valid: true
95 - Passes: 5865, count: 78498, Valid: true
96 - Passes: 5840, count: 78498, Valid: true
97 - Passes: 5827, count: 78498, Valid: true
98 - Passes: 5830, count: 78498, Valid: true
99 - Passes: 5824, count: 78498, Valid: true
```
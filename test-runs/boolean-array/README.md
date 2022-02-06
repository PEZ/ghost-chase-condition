# Sieve test using an array of `boolean`s

* **Sieve limit**: 1000000
* **Warmup time**: 5 seconds
* **Run time**: 5 seconds
* **Runs**: 100
* **JDK/JVM**: 17/17

Here we use an array of `boolean`s to store the the sieve.

* **Hypothesis**: None, really. But if the flicker is caused when updating the BitSet, we should not see it happening here.
* **Results**: No flicker at all. In fact, it is amazingly stable.


## Results: [pez-x64-ubuntu](../../machine-pez-x64-ubuntu.md)

```
$ docker build -t primes-java-bitset  . && docker run --rm -it primes-java-bitset
0 - Passes: 9579, count: 78498, Valid: true
1 - Passes: 9584, count: 78498, Valid: true
2 - Passes: 9525, count: 78498, Valid: true
3 - Passes: 9582, count: 78498, Valid: true
4 - Passes: 9530, count: 78498, Valid: true
5 - Passes: 9531, count: 78498, Valid: true
6 - Passes: 9571, count: 78498, Valid: true
7 - Passes: 9549, count: 78498, Valid: true
8 - Passes: 9490, count: 78498, Valid: true
9 - Passes: 9465, count: 78498, Valid: true
10 - Passes: 9510, count: 78498, Valid: true
11 - Passes: 9536, count: 78498, Valid: true
12 - Passes: 9560, count: 78498, Valid: true
13 - Passes: 9558, count: 78498, Valid: true
14 - Passes: 9554, count: 78498, Valid: true
15 - Passes: 9523, count: 78498, Valid: true
16 - Passes: 9485, count: 78498, Valid: true
17 - Passes: 9583, count: 78498, Valid: true
18 - Passes: 9556, count: 78498, Valid: true
19 - Passes: 9467, count: 78498, Valid: true
20 - Passes: 9533, count: 78498, Valid: true
21 - Passes: 9522, count: 78498, Valid: true
22 - Passes: 9502, count: 78498, Valid: true
23 - Passes: 9522, count: 78498, Valid: true
24 - Passes: 9537, count: 78498, Valid: true
25 - Passes: 9502, count: 78498, Valid: true
26 - Passes: 9567, count: 78498, Valid: true
27 - Passes: 9550, count: 78498, Valid: true
28 - Passes: 9433, count: 78498, Valid: true
29 - Passes: 9559, count: 78498, Valid: true
30 - Passes: 9571, count: 78498, Valid: true
31 - Passes: 9515, count: 78498, Valid: true
32 - Passes: 9494, count: 78498, Valid: true
33 - Passes: 9416, count: 78498, Valid: true
34 - Passes: 9481, count: 78498, Valid: true
35 - Passes: 9516, count: 78498, Valid: true
36 - Passes: 9418, count: 78498, Valid: true
37 - Passes: 9513, count: 78498, Valid: true
38 - Passes: 9477, count: 78498, Valid: true
39 - Passes: 9390, count: 78498, Valid: true
40 - Passes: 9530, count: 78498, Valid: true
41 - Passes: 9524, count: 78498, Valid: true
42 - Passes: 9519, count: 78498, Valid: true
43 - Passes: 9430, count: 78498, Valid: true
44 - Passes: 9482, count: 78498, Valid: true
45 - Passes: 9400, count: 78498, Valid: true
46 - Passes: 9441, count: 78498, Valid: true
47 - Passes: 9489, count: 78498, Valid: true
48 - Passes: 9395, count: 78498, Valid: true
49 - Passes: 9443, count: 78498, Valid: true
50 - Passes: 9519, count: 78498, Valid: true
51 - Passes: 9547, count: 78498, Valid: true
52 - Passes: 9413, count: 78498, Valid: true
53 - Passes: 9423, count: 78498, Valid: true
54 - Passes: 9502, count: 78498, Valid: true
55 - Passes: 9533, count: 78498, Valid: true
56 - Passes: 9513, count: 78498, Valid: true
57 - Passes: 9442, count: 78498, Valid: true
58 - Passes: 9502, count: 78498, Valid: true
59 - Passes: 9480, count: 78498, Valid: true
60 - Passes: 9532, count: 78498, Valid: true
61 - Passes: 9504, count: 78498, Valid: true
62 - Passes: 9495, count: 78498, Valid: true
63 - Passes: 9506, count: 78498, Valid: true
64 - Passes: 9466, count: 78498, Valid: true
65 - Passes: 9507, count: 78498, Valid: true
66 - Passes: 9535, count: 78498, Valid: true
67 - Passes: 9378, count: 78498, Valid: true
68 - Passes: 9490, count: 78498, Valid: true
69 - Passes: 9503, count: 78498, Valid: true
70 - Passes: 9482, count: 78498, Valid: true
71 - Passes: 9548, count: 78498, Valid: true
72 - Passes: 9492, count: 78498, Valid: true
73 - Passes: 9518, count: 78498, Valid: true
74 - Passes: 9385, count: 78498, Valid: true
75 - Passes: 9485, count: 78498, Valid: true
76 - Passes: 9513, count: 78498, Valid: true
77 - Passes: 9476, count: 78498, Valid: true
78 - Passes: 9546, count: 78498, Valid: true
79 - Passes: 9524, count: 78498, Valid: true
80 - Passes: 9478, count: 78498, Valid: true
81 - Passes: 9475, count: 78498, Valid: true
82 - Passes: 9502, count: 78498, Valid: true
83 - Passes: 9516, count: 78498, Valid: true
84 - Passes: 9542, count: 78498, Valid: true
85 - Passes: 9429, count: 78498, Valid: true
86 - Passes: 9484, count: 78498, Valid: true
87 - Passes: 9500, count: 78498, Valid: true
88 - Passes: 9487, count: 78498, Valid: true
89 - Passes: 9488, count: 78498, Valid: true
90 - Passes: 9434, count: 78498, Valid: true
91 - Passes: 9515, count: 78498, Valid: true
92 - Passes: 9442, count: 78498, Valid: true
93 - Passes: 9435, count: 78498, Valid: true
94 - Passes: 9456, count: 78498, Valid: true
95 - Passes: 9506, count: 78498, Valid: true
96 - Passes: 9563, count: 78498, Valid: true
97 - Passes: 9497, count: 78498, Valid: true
98 - Passes: 9438, count: 78498, Valid: true
99 - Passes: 9458, count: 78498, Valid: true
```
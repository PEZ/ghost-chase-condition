import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrimeSieve {
	private static final Map<Integer, Integer> VALIDATION_DATA;
	private final boolean[] sieve;
	private final int n;

	public PrimeSieve(int n) {
		this.n = n;
		int half_n = (n + 1) >> 1;
		this.sieve = new boolean[half_n];
		Arrays.fill(this.sieve, true);
	}

	public void run() {
		int q = (int) Math.ceil(Math.sqrt(n));
		for (int p = 3; p < q; p += 2) {
			if (sieve[p >> 1]) {
				for (int i = (p * p) >> 1; i < n >> 1; i += p) {
					sieve[i] = false;
				}
			}
		}
	}

	int count() {
			int count = 0;
			for (int i = 0; i < sieve.length; i++) {
				if (sieve[i]) {
					count++;
				}
			}
			return count;
	}

	public void printResults(int passes) {
		System.out.printf("Passes: %d, count: %d, Valid: %s%n", passes, count(),
				VALIDATION_DATA.get(n) == count());
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		PrimeSieve sieve = null;
		int limit = 1000000;
		int warmupTime = 5000;
		int runTime = 5000;

		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-limit") && args.length - 1 > i) {
				limit = Integer.parseInt(args[i + 1]);
			}
		}

		// warmup
		while ((System.currentTimeMillis() - start) < warmupTime) {
			sieve = new PrimeSieve(limit);
			sieve.run();
		}

		int passes = 0;
		start = System.currentTimeMillis();
		while ((System.currentTimeMillis() - start) < runTime) {
			sieve = new PrimeSieve(limit);
			sieve.run();
			passes++;
		}

		if (sieve != null) {
			sieve.printResults(passes);
		}
	}

	static {
		VALIDATION_DATA = new HashMap<>();
		VALIDATION_DATA.put(10, 4);
		VALIDATION_DATA.put(100, 25);
		VALIDATION_DATA.put(1000, 168);
		VALIDATION_DATA.put(10000, 1229);
		VALIDATION_DATA.put(100000, 9592);
		VALIDATION_DATA.put(1000000, 78498);
		VALIDATION_DATA.put(10000000, 664579);
		VALIDATION_DATA.put(100000000, 5761455);
	}
}

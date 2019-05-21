/*
 * Manny Peterson's Solution to Project Euler Problem #7
 * https://projecteuler.net/problem=7
 * 
 * Enjoy! :)
 * 
 */

public class Main {
	public static boolean isPrime(long n) {
		if (n <= 1) return false;
		if (n > 2 && (n & 1) == 0) return false;
		for (long i = 3; i <= Math.sqrt(n); i += 2) if (n % i == 0) return false;
		return true;
	}
	public static void main(String[] args) {
		long n = 1, p = 1;
		do {
			n += 2;
			if (Main.isPrime(n)) p += 1;
		} while (p < 10001);
		System.out.format("ANSWER = %d\n", n);
	}
}
package Recursion;

public class Factorial {

	static long factorial(int n) {
		long res = 1;
		for (int i = n; i > 0; i--) {
			res *= i;
		}
		return res;
	}

	public static long factorial_Recursive(int n) {
		if (n == 0)
			return 1;
		return n * factorial_Recursive(n - 1);
	}
}

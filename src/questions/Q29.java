package questions;

/**
 * 29.Divide Two Integers
 */
public class Q29 {
	
	public static void main(String[] args) {
		int dividend = -2147483648;
		int divisor = -1;
		System.out.println(divide(dividend, divisor));
	}
	
	public static int divide(int dividend, int divisor) {
        long d = (long)dividend/ (long)divisor;
		if(d > Integer.MAX_VALUE) return Integer.MAX_VALUE;
		else if(d < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		return (int)d;
    }
}

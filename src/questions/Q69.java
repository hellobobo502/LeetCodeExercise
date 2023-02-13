package questions;

/**
 * 69.Sqrt(x)
 */
public class Q69 {
	public static void main(String[] args) {
		int x = 8;
		System.out.println(mySqrt(x));
	}

	public static int mySqrt(int x) {
		Double d = Math.sqrt(x);
        return d.intValue();
    }
}

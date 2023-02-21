package questions;

/**
 * 7.Reverse Integer
 */
public class Q7 {

	public static void main(String[] args) {
		int x = -123;
		System.out.println(reverse(x));
	}

	public static int reverse(int x) {
		int pre=0, rev=0;
		while(x != 0) {
			rev = rev * 10 + x % 10; //one; -3 * 100 + -2 * 10 + -1 * 1 
			if((rev - x % 10)/10 != pre) return 0; //four check;
			pre = rev; //three;
			x = x / 10; //two;
		}
		return rev;
    }
}

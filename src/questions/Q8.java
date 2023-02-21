package questions;

/**
 * 8.String to Integer (atoi)
 */
public class Q8 {

	public static void main(String[] args) {
		String s = " ";
		System.out.println(myAtoi(s));
	}
	
	public static int myAtoi(String s) {
		if(s == null || s.length() == 0) return 0;

		int i=0, digit=0, isNegative=1;
		
		while(i<s.length() && s.charAt(i) == ' ') {
			i++;
		}
		
		if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
			isNegative = (s.charAt(i++) == '+') ? 1 : -1;
		
		int intMax = Integer.MAX_VALUE / 10;
		while(i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			if(digit > intMax || (digit == intMax && s.charAt(i) > '7'))
				return isNegative == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			
			digit = digit * 10 + (s.charAt(i)-'0');
			i++;
		}
		return isNegative * digit;
    }
}

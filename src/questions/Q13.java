package questions;

/**
 * 13.RomanToInteger
 */
public class Q13 {
	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
		int sum = 0;
		for(int i=s.length()-1; i>=0; i--) {
			int num = 0;
			switch (s.charAt(i)) {
				case 'I': num = 1; break;
				case 'V': num = 5; break;
				case 'X': num = 10; break;
				case 'L': num = 50; break;
				case 'C': num = 100; break;
				case 'D': num = 500; break;
				case 'M': num = 1000; break;
			}
			
			if(num*4 < sum) {
				sum -= num;
			}else {
				sum += num;
			}
		}
		
		return sum;
	}
}

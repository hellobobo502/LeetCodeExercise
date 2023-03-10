package questions;

/**
 * 12.Integer to Roman
 */
public class Q12 {

	public static void main(String[] args) {
		int num = 2322;
		System.out.println(intToRoman(num));
	}

	public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		for(int i=0; i<nums.length && num > 0; i++) {
			if(num >= nums[i]) {
				for(int j = num / nums[i]; 0 < j; j--) {
					sb.append(romans[i]);
					//num -= nums[i];
				}
				num = num % nums[i];
			}
		}
		return sb.toString();
    }
}

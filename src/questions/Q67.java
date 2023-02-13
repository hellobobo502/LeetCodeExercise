package questions;

/**
 * 67.Add Binary
 */
public class Q67 {
	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
        int posA = a.length()-1;
		int posB = b.length()-1;
		int ca = 0;
		
		StringBuffer str = new StringBuffer();
		while(posA >= 0 || posB >= 0) {
			int sum = ca;
			if(posA >=0) {
				sum += a.charAt(posA) - '0';
				posA--;
			} 
			if(posB >=0) {
				sum += b.charAt(posB) - '0';
				posB--;
			}
			
			str.append(sum%2);
			ca = sum/2;
		}
		
		if(ca > 0) str.append(ca);
		return str.reverse().toString();
    }
}

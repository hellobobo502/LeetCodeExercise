package questions;

/**
 * 6.Zigzag Conversion
 */
public class Q6 {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 4;
		System.out.println(convert(s, numRows));
	}

	public static String convert(String s, int numRows) {
		char[] c = s.toCharArray();
		StringBuffer[] sb = new StringBuffer[numRows];
		
		for(int i=0; i<numRows; i++)
			sb[i] = new StringBuffer();
		
		int pos = 0;
		while(pos < s.length()) {
			for(int i=0; i<numRows; i++) {
				if(pos >= s.length()) break;
				sb[i].append(c[pos++]);
			}
			
			for(int j=numRows-2; j>0; j--) {
				if(pos >= s.length()) break;
				sb[j].append(c[pos++]);
			}
		}
		
		for(int i=1; i<numRows; i++)
			sb[0].append(sb[i]);
		
		
		return sb[0].toString();
    }
}

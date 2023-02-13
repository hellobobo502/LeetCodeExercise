package questions;

import java.util.Arrays;

/**
 * 14.Longest Common Prefix
 */
public class Q14 {
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        if(strs == null)
			return "";
			
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
		
		String s = strs[0];
		String e = strs[strs.length-1];
		
		int c = 0;
		while(c < s.length()) {
			if(s.charAt(c) == e.charAt(c)) {
				c++;	
			}else {
				break;
			}
		}
		
		return c == 0 ? "" : s.substring(0, c);
    }
}

package questions;

import java.util.HashSet;
import java.util.Set;

/**
 * 3.Longest Substring Without Repeating Characters
 */
public class Q3 {

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		int i=0, j=0, max=0;
		Set<Character> set = new HashSet<>();
		
		while(j < s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				max = Math.max(max, set.size());
			}else {
				set.remove(s.charAt(i++));
			}
		}
		
		return max;
    }
}

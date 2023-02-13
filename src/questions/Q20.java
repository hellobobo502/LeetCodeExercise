package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20.Valid Parentheses
 */
public class Q20 {
	public static void main(String[] args) {
		String s = "(]";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
        if(s==null || s.length()==0)
			return false;
		
		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		Stack<Character> sChar = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				sChar.push(s.charAt(i));
				continue;
			}
			
			if(sChar.size() == 0 || map.get(s.charAt(i)) != sChar.pop()) {
				return false;
			}
		}
		
		if(sChar.size() == 0) {
			return true;
		}
		
		return false;
    }
}

package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * 17.Letter Combinations of a Phone Number
 */
public class Q17 {

	public static void main(String[] args) {
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}

	public static List<String> letterCombinations(String digits) {
		if(digits == null || digits.length() == 0) return new ArrayList<String>();
		
		List<String> combinations = new ArrayList<>();
        combinations.add("");
        
        for(char d : digits.toCharArray()) {
        	String str = "";
        	switch(d) {
        		case '2': str = "abc"; break;
        		case '3': str = "def"; break;
        		case '4': str = "ghi"; break;
        		case '5': str = "jkl"; break;
        		case '6': str = "mno"; break;
        		case '7': str = "pqrs"; break;
        		case '8': str = "tuv"; break;
        		case '9': str = "wxyz"; break;
        		default: continue;
        	}
        	List<String> letter = new ArrayList<>();
    		for(String l : combinations) {
    			int i = 0;
    			while(i < str.length()) {
    				letter.add(l + str.charAt(i));
    				i++;
    			}
    		}
        	combinations = letter;
        }
        
        return combinations;
    }
	
//	public static List<String> letterCombinations(String digits) {
//        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//        List<String> result = new ArrayList<String>();
//
//        if (digits.length()==0) return result;
//        
//        result.add("");
//        for (int i=0; i<digits.length(); i++) 
//            result = combine(digitletter[digits.charAt(i)-'0'],result);
//        
//        return result;
//    }
//    
//    public static List<String> combine(String digit, List<String> l) {
//        List<String> result = new ArrayList<String>();
//        
//        for (int i=0; i<digit.length(); i++) 
//            for (String x : l) 
//                result.add(x+digit.charAt(i));
//
//        return result;
//    }
}

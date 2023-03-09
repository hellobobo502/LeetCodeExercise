package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * 22.Generate Parentheses
 */
public class Q22 {
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(generateParenthesis(n));
	}
	
	public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, n, "", 0, 0);
        return res;
    }
	
	public static void generate(List<String> res, int n, String str, int left, int right) {
		if(str.length() == n*2) {
			res.add(str);
			return;
		}
			
		if(left != n)
			generate(res, n, str+'(', left+1, right);
			
		if(right < left)
			generate(res, n, str+')', left, right+1);
	}
}

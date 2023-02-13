package questions;

/**
 * 9. PalindromeNumber
 */
public class Q9 {
	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
        if(x < 0) {
        	return false;
        }
        
        String xStr = String.valueOf(x);
        int s = 0;
        int e = xStr.length()-1;
        
        while(s <= e) {
        	if(xStr.charAt(s) != xStr.charAt(e))
        		return false;
        	
        	s++;
        	e--;
        }
        
        return true;
    }
}

package questions;

/**
 * 58.Length of Last Word
 */
public class Q58 {
	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
        int len = 0;
        for(int i=s.length()-1; i>=0; i--) {
        	if(s.charAt(i) != ' ') {
        		len++;
        	}else {
        		if(len > 0) return len;
        	}
        }
        return len;
    }
}

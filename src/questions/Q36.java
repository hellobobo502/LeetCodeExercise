package questions;

import java.util.HashSet;
import java.util.Set;

/**
 * 36.Valid Sudoku
 */
public class Q36 {

	public static void main(String[] args) {
		char[][] board = {{'5','3','.','.','7','.','.','.','.'},
						  {'6','.','.','1','9','5','.','.','.'},
						  {'.','9','8','.','.','.','.','6','.'},
						  {'8','.','.','.','6','.','.','.','3'},
						  {'4','.','.','8','.','3','.','.','1'},
						  {'7','.','.','.','2','.','.','.','6'},
						  {'.','6','.','.','.','.','2','8','.'},
						  {'.','.','.','4','1','9','.','.','5'},
						  {'.','.','.','.','8','.','.','7','9'}};
		System.out.println(isValidSudoku(board));
	}
	
	public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<board.length; i++) {
        	for(int j=0; j<board[i].length; j++) {
        		if(board[i][j] != '.') {
        			if(!(set.add("Row" + i + "-" + board[i][j])) ||
        					!(set.add("Column" + j + "-" + board[i][j])) ||
        					!(set.add("Block"+ i/3 + j/3 + "-" + board[i][j])))
        				return false;
        		}
        	}
        }
        
        return true;
    }
}

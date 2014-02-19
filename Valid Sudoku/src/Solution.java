/**
 * Feb-18-2014
 * @author Ivoryhe
 * Valid Sudoku
 * 
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, 
 * where empty cells are filled with the character '.'.
 * A partially filled sudoku which is valid.
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. 
 * Only the filled cells need to be validated.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] block = new boolean[9][9];
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.') {continue;}
                int num = board[i][j] - '1';
                if(row[i][num] || column[j][num] || block[i - i%3 + j/3][num]){
                    return false;
                }
                else{
                    row[i][num] = true;
                    column[j][num] = true;
                    block[i - i%3 + j/3][num] = true;
                }
            }
        }
        return true;
    }
}
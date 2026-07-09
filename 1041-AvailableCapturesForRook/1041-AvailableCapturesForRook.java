// Last updated: 7/9/2026, 3:08:46 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int row = 0;
        int col = 0;
        int attack = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                    break; 
                }
            }
        }
        //upward
        int r = row;
        int c = col;
        while(r>=0 && board[r][c] != 'B'){
            if (board[r][c] == 'p'){
                attack++;
                break;
            }
            r--;
        }
        //backward
        r = row;
        c = col;
        while(r<=7 && board[r][c] != 'B'){
            if (board[r][c] == 'p'){
                attack++;
                break;
            }
            r++;
        }
        //left
        r = row;
        c = col;
        while(c>=0 && board[r][c] != 'B'){
            if (board[r][c] == 'p'){
                attack++;
                break;
            }
            c--;
        }
        //right
        r = row;
        c = col;
        while(c<=7 && board[r][c] != 'B'){
            if (board[r][c] == 'p'){
                attack++;
                break;
            }
            c++;
        }
        return attack;
    }
}
class Solution {
    public boolean isSafe(char[][] board, int row, int col,int number){

        // row and col check
        for(int i =0; i<board.length;i++){
            if(board[i][col]==(char)(number+'0')){
                return false;
            }
            if(board[row][i]==(char)(number+'0')){
                return false;
            }
        }

        // grid check
        // starting point of each grid

        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i=sr; i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j] == (char)(number+'0')){
                    return false;
                }
            }
        }

        return true;
         
    }
    public boolean helper(char[][] board,int row, int col){
        // base condition
        if(row == board.length){
            return true;
        }

        int newRow=0;
        int newCol = 0;
        // in the same row
        if(col != board.length-1){
            newRow = row;
            newCol = col +1 ;
        }
        // to change row after one ends
        else{
            newRow = row + 1;
            newCol = 0;
        }

        // cell empty
        if(board[row][col] != '.'){
            if(helper(board, newRow, newCol)){
                return true;
            }
            else{
                for(int i=1;i<=9;i++){
                    if(isSafe(board,row,col,i)){
                        board[row][col] = (char)(i+'0'); // typecast
                        if(helper(board, newRow, newCol)){
                            return true;
                        }
                        else{
                            board[row][col]= '.';
                        }
                    }
                }
            }
        }

        return false;

    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
}

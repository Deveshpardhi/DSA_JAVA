public class backtrack_NQUEEN {

    public static boolean isSafe(char board[][],int row,int col){

        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    
    public static void printq(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
        
    public static void nQueen(char board[][],int row){
        //base
        if(row==board.length){
            printq(board);
            return;
        }

        for(int i=0;i<board.length;i++){
            if(isSafe(board, row, i)){
                board[row][i]='Q';
                nQueen(board, row+1);
                board[row][i]='X';
            }
            
        }
    }

    
    
    public static void main(String[] args) {
        int n=4 ;
        char board[][]=new char[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }

        nQueen(board,0);
    }
}

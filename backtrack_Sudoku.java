public class backtrack_Sudoku {

    public static boolean isSafe(int sudoku[][],int row,int col,int digit){

        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        for(int i=0;i<9;i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }

        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean sudoku_solver(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }

        //recursion
        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow+=1;
            nextcol=0;
        }

        if(sudoku[row][col]!=0){
            return sudoku_solver(sudoku, nextrow, nextcol); 
        }

        for(int i=1;i<=9;i++){
            if(isSafe(sudoku,row,col,i)){
                sudoku[row][col]=i;
                if(sudoku_solver(sudoku, nextrow, nextcol)){
                    return true;
                }
                sudoku[row][col]=0;

            }
        }
        return false;
    }

    public static void print_sudo(int arr[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int sudoku[][]={{0,4,0,0,0,5,8,7,0},
                        {0,0,0,0,0,0,1,0,0},
                        {0,9,0,0,0,0,0,0,2},
                        {0,0,0,0,7,0,4,0,0},
                        {0,5,1,3,0,0,0,0,7},
                        {0,0,3,0,0,6,0,0,0},
                        {0,0,5,0,0,2,0,9,0},
                        {0,0,0,5,0,8,6,0,0},
                        {0,0,0,0,6,4,0,0,0}};

    if(sudoku_solver(sudoku,0,0)){
        System.out.println("Solution Exits");
        print_sudo(sudoku);
    }else{
        System.out.println("Solution doesnt exits");
    }
    }

    
}

import java.util.Scanner;

public class array_2d {

    public static void search(int array[][],int key){
        int n=array.length;
        int m=array[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array[i][j]==key){
                    System.out.println(key+" found at index ("+i+","+j+")");
                }
            }
        }
    }

    public static void spiral(int array[][]){
        int s_row=0,s_col=0;
        int e_row=array.length,e_col=array[0].length;
        int arr[]=new int[100];
        int count=0;

        while (s_row<e_col) {
            for(int i=s_row;i<e_row;i++){
                arr[count]=array[0][i];
                count=count+1;
            }
            for(int i=s_row;i<e_col;i++){
                arr[count]=array[i][array.length-1];
                count=count+1;
            }
            for(int i=e_col;i>=s_col;i--){
                arr[count]=array[array[0].length-1][i];
                count=count+1;
            }
            for(int i=e_col;i>=s_row;i--){
                arr[count]=array[i][0];
                count=count+1;
            }
            s_row=s_row+1;
            s_col=s_col+1;
            e_col=e_col-1;
            e_col=e_col-1;
        }

        for(int i=0;i<array.length*array[0].length;i++){
            System.out.print(arr[i]);
        }
        
        
    }

    public static void main(String []args){
        // Scanner sc=new Scanner(System.in);
        // int array[][]=new int[3][3];
        // int n=array.length;
        // int m=array[0].length;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         array[i][j]=sc.nextInt();
        //     }
        // }
        int array[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        spiral(array);

    }
}

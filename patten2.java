
import java.util.*;

public class patten2 {
    public static void main(String args[]){
        // int i=5,j=4;

        // for(i=0;i<10;i++){
        //     for(j=0;j<7;j++){
        //         if((i==0) || (j==0) || (i==9) || (j==6) ){
        //              System.out.print("*");
        //          }else{
        //             System.out.print(" ");
        //          }
        //     }
        //     System.out.println("\n");
        // }

        //  Inverted half pyraid
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("\n");
        // }



        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int num=1;
        // for(int i=n;i>0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print(j+1);
        //     }
        //     System.out.println();
        // }

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        // Butterfly patten
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int k=1;k<=2*(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int k=1;k<=2*(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Solid Rhombus
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=n;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //hollow Rhombus
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=n;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){  
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1 ;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){  
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

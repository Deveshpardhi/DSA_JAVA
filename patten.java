
import java.util.Scanner;

public class patten {
    public static void main(String args[]){
        
        System.out.print("Enter:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

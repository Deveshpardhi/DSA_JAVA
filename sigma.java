
import java.util.*;

class java{
    public static void main(String[] args) {
        //System.out.println("Hello World!!");

        // Scanner sc=new Scanner(System.in);
        // int a =sc.nextInt();
        // int b=sc.nextInt();
        // int sum=a*b;

        // System.out.println("Sum:"+sum);

        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the radius:");
        // float r=sc.nextFloat();
        // double area=3.14*r*r;
        // System.out.println("Area:"+area);

        // int pencil=sc.nextInt();
        // int pen= sc.nextInt();
        // int eraser=sc.nextInt();

        // long total=pencil+pen+eraser;
        // float gst=(float)(total*0.18);

        // float cost=(float)total+gst;
        // System.out.println("Total cost:"+cost);

        int n=sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);

        
    }
}       
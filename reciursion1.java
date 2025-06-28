
public class reciursion1 {

    public static void printdec(int n){
        if(n==1){
            System.out.println(n+" ");
            return ;
        }
        System.out.println(n);
        printdec(n-1);
    }
    
    public static void printinc(int n){
        if(n==1){
            System.out.println(n+" ");
            return ;
        }
        printinc(n-1);
        System.out.println(n);
        
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum=0;
        return n+sum(n-1);
    }
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String []args){
        System.out.println(fibo(28));

    }
}


public class bits {

    public static void odd_even(int n){
        int bit=1;
        if((n & bit)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    public static int getithBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        } 
    }
    public static int setIthBits(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearIthBits(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int clearLastIBits(int n,int j){
        int num=0;
        for(int i=1;i<j;i++){
            num=clearIthBits(n, i);
        }
        return num;
    }   
    public static void main(String[] args) {
        //odd_even(6);
        System.out.println(clearLastIBits(15, 2));
    }
}

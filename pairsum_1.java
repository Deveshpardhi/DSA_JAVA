public class pairsum_1 {
    
    public static boolean pairsum(int arr[],int target){
        int lp=0;
        int rp=arr.length-1;

        while (lp<rp) {
            if(arr[lp]+arr[rp]==target){
                return true;
            }
            if(arr[lp]+arr[rp]<target){
                lp++;
            }else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={6,8,9,10,11,15};
        System.out.println(pairsum(arr, 35));
    }
}

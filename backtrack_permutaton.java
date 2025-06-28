public class backtrack_permutaton {
   
    public static int total(int[] customers, int[] grumpy, int minutes){
        int sum=0;
        int n=customers.length;
        

        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        return sum;
    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int grp[]=new int[n];
        int index=0;
        int max=0;
        int count=0;

        while(count<=n-minutes){
            for(int i=0;i<n;i++){
                grp[i]=grumpy[i];
            }
            int st=0;
            for(int i=index;i<minutes;i++){
                if(index<=n-minutes){
                    grp[st]=1;
                    index++;
                    minutes++;
                } 
            }

            int sum=total(customers,grp,minutes);
            if(sum>max){
                max=sum;
            }
            for(int i=0;i<n;i++){
                grp[i]=grumpy[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,2,1,1,7,5};
        int a[]={0,1,0,1,0,1,0,1};
        int sum=maxSatisfied(arr,a,3);
        
        System.out.println(sum);
    }
}

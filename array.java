
import java.util.*;
import java.util.Scanner;

public class array {

    public static int linear_search(int array[],int n){
        Scanner sc=new Scanner(System.in);
        
        int flag=0;
        
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter element to search in an array:");
        int elem=sc.nextInt();

        for(int i=0;i<array.length;i++){
            if(array[i]==elem){
                System.out.println("Element found at index "+ i);
                flag=1;
                return i;
            }
        }   
        if(flag==0){
            System.out.println("Element not found");
        }
        return -1;
    }

    public static int binary_search(int array[],int n){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to search in an array:");
        int elem=sc.nextInt();
        int start=0,end=n-1;
        
        while (array[start]<array[end]) {
            int mid=(start+end)/2;
            if(array[mid]==elem){
                return mid;
            }
            if(array[mid]<elem){
                start=mid+1;
            }else{
                end=mid-1;
            }   
        }
        return -1;
    }

    public static void sub_arrays(int array[],int key){
        
        int start,end;
        int c=0;
        for(int i=0;i<array.length;i++){
            start=i;    
            
            for(int j=i;j<array.length;j++){
                end=j;
                int count=0;
                
                for(int k=start;k<=end;k++){
                    // count=count+array[k];
                    // if(count%key==0){
                    //     c++;
                    // }
                    if(array[k]%2!=0){
                        count++;
                    }
                    if(count==key){
                        c++;
                    }

                    //System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(c);
    }

    public static void trapped_water(int height[]){
        int left_h[]=new int[height.length];
        int right_h[]=new int[height.length];
        int water=0;
        left_h[0]=height[0];
        right_h[height.length-1]=height[height.length-1];

        //left height array
        for(int i=1;i<height.length;i++){
            if(height[i]<=left_h[i-1]){
                left_h[i]=left_h[i-1];
            }else{
                left_h[i]=height[i];
            }
        }
        
        for(int i=height.length-2;i>=0;i--){
            if(height[i]<=right_h[i+1]){
                right_h[i]=right_h[i+1];
            }else{
                right_h[i]=height[i];
            }
        }

        for(int i=0;i<height.length;i++){
            if(left_h[i]<=right_h[i]){
                if((left_h[i]-height[i])<=0){
                    water=water+0;
                }else{
                    water=water+(left_h[i]-height[i]);
                }
            }else{
                if((right_h[i]-height[i])<=0){
                    water=water+0;
                }else{
                    water=water+(right_h[i]-height[i]);
                }
            }  
        }
        System.out.println("Total water harvested:"+water);

    }


    public static void main(String []args){
        //Scanner sc=new Scanner(System.in);
        //System.out.print("Enter no of elements in array:");
        //int n=sc.nextInt();
        //int array[]=new int[n];

        int array[]={2,2,2,1,2,2,1,2,2,2};
        sub_arrays(array,2);
        
    }
}

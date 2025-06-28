
    public class codee {
    public static void subarray(int arr[], int k) {
            for (int i = 0; i < arr.length; i++) {
                int st = i;
                for (int j = i; j < arr.length; j++) {
                    int end = j;
                    int count = 0;
                    for (int ka = st; ka <= end; ka++) {
                        count += arr[ka];
                    }
                    if (count == k) {
                        for (int a = st; a <= end; a++) {
                            System.out.print(arr[a] + " ");
                        }
                        System.out.println(); // to print the subarray in a new line
                    }
                }
            }
    }

    public static void sliding_window(int arr[],int key){
        
            
    }
    

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        sliding_window(arr, 5);
    }
    
}



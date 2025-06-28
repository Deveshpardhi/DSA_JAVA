public class pairsum_2 {

    public static boolean pairsum(int arr[], int target) {
        int n = arr.length;
        int bp = -1;

        // Find the pivot point where the array is rotated
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                bp = i;
                break;
            }
        }

        // If the array is not rotated, set bp to the last element
        if (bp == -1) {
            bp = n - 1;
        }

        int lp = (bp + 1) % n;
        int rp = bp;

        // Two-pointer approach to find the target sum
        while (lp != rp) {
            int currentSum = arr[lp] + arr[rp];
            if (currentSum == target) {
                return true;
            }

            if (currentSum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (rp + n - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {15, 6, 8, 9, 10, 11}; // Rotated array
        System.out.println(pairsum(arr, 66)); // Output should be true
    }
}

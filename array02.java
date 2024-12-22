public class array02 {
    public static int returnMax(int arr[]) {
        if(arr.length < 1) {
            return -1;
        }
        int ans = arr[0];
        for(int num : arr) {
            if(num > ans) {
                ans = num;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {};
        int sol = returnMax(arr);
        if( sol == -1) {
            System.err.println("Insufficient array size");
        }else {
            System.out.println("Max element is : "+sol);
        }
    }
}

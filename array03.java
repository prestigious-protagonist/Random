import java.util.Arrays;
public class array03 {
    public static int[] search2D(int [][] arr,int target) {
  
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {

                    return new int[]{row+1, col+1};
                }
            }
        }  
        return new int[]{-1, -1};
    }
    public static void main(String []args) {
        int arr[][] = {{1,35,6},{24,673}};
        System.out.println(Arrays.toString(search2D(arr, 35)) );
        //code to check index -1 in array
    }
}
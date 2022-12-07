//Target searching in a 2D array sorted rowwise and columnwise.
import java.util.Arrays;
public class BSIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,23,35,45},
            {25,34,38,48},
            {30,39,42,53}
        };
        System.out.println(Arrays.toString(search(arr, 25)));
        
    }
    static int[] search(int arr[][],int target) {
        int row=0;
        int col=arr[0].length-1;
        while(row < arr.length && col >= 0) {
            if(arr[row][col]==target) {
                return new int[] {row,col};
            }
            if(arr[row][col]<target) {
                row++;
            }
            if(arr[row][col]>target) {
                col--;
            }
        }
        return new int[] {-1,-1}; //Target not found
    }   //Do this question the other way also.
}

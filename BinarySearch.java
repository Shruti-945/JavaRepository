import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        //Binary search is used only for sorted array.
        //Binary search complexity is 0(log N).
        int[] arr={2,4,6,8,9,12};
        int target=12;
        int ans=Binarysearch(arr, target);
        System.out.println("The index of the target element is " +ans);
}
    //Return the index.
    //Return -1 if it does not exist.
    static int Binarysearch(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
        //Find the middle element.
       // int mid=(start+end)/2;   //It might be possible that start+end exceeds the range of integer value.
       int mid=start+(end-start)/2;  //Same thing as above. Just check this out.
       if(target<arr[mid]) {
        end=mid-1;
       }
       else if(target>arr[mid]) {
        start=mid +1;
       }
       else if(target==arr[mid]) {
        //Answer found.
        return mid;
       }
    }
    return-1;
 }
}

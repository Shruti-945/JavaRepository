public class OrderAgnosticBS {
    public static void main(String[] args) {
      int[] arr={-18,-12,-4,-2,0,2,4,8,56,79,87,90};
      //Sorted Array=Binary Search
      int target=87;
      int ans=orderAgnosticBS(arr,target);
      System.out.println("Index of the target element is " +ans);
}
    //Return the index of the target element in the array.
    //Return -1 if not present in the array.
    static int orderAgnosticBS(int[] arr,int target) 
    {
    //Setting the index.
    int start=0;
    int end=arr.length-1;
    //Find whether the array is ascending or descending.
    String order=(arr[start]<arr[end])?"Ascending":"Descending"; //Ternary operator
    //Iteration
    while(start<=end) {
        //Find the middle element.
       // int mid=(start+end)/2;   //It might be possible that start+end exceeds the range of integer value.
       int mid=start+(end-start)/2;  //Same thing as above. Just check this out.
       if(target==arr[mid]) {
        return mid;
       }
       if(order=="Ascending") {
       if(target<arr[mid]) {
        end=mid-1;
       }
       else if(target>arr[mid]) {
        start=mid +1;
       }
      }
        if(order=="Descending") {
         //For descending order.
        if(target<arr[mid]) {
            start=mid+1;
        }
        else if(target>arr[mid]) {
            end=mid-1;
        }
    }
}
    return -1;
}
}


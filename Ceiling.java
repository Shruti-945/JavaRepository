public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};  //Sorted array=Binary Search
        int target=15;
        int ans=ceiling(arr,target);
        System.out.println("Ceiling index of target element is " +ans);

    }
    //Return index of smallest number>=target.
    static int ceiling(int[] arr,int target) {
        int start=0;
        int end=arr.length;
        while(start<=end) {
        //Find the middle element.
        //This is in the while loop because mid value is changing according to the expression in order to half the array.
        int mid=start+(end-start)/2; //  //It might be possible that start+end exceeds the range of integer value.
        //but what if target >greatest element in the array.
        if(target>arr[arr.length-1]) {
            return -1;
        }
          if(target<arr[mid]) {
            end=mid-1;
           }
           if(target>arr[mid]) {
            start=mid+1;
           }
           else if(target==arr[mid]) //condition always with if or else if
           {
            //Answer found.
            return mid;
           }
        }
       return start;
 }
}

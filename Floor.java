public class Floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=14;
        int ans=floor(arr,target);
        System.out.println("Floor index of the element is "+ans);

    }
    //Return index of biggest number<=target.
    static int floor(int[] arr,int target) {
        int start=0;
        int end=arr.length;
        while(start<=end) {
        //Find the middle element.
        //This is in the while loop because mid value is changing according to the expression in order to half the array.
        int mid=start+(end-start)/2;  //It might be possible that start+end exceeds the range of integer value.
        if(target<arr[0]) {
                return -1;
        }
        if(target<arr[mid]) {
            end=mid-1;
        }
        else if(target>arr[mid]) {
            start=mid+1;
        }
        else if(target==arr[mid]){
         //Answer found.
         return mid;
        }
        }
        return end;
 }
}


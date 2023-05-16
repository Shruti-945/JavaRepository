public class BS {
    public static void main(String[] args) {
    int[] arr={1,3,6,7,8,15,16,19,28};
    int target=15;
    System.out.print("Number is at location "+ (search(arr, 0, arr.length-1, target)+1));        
    }
    static int search(int arr[], int start,int end,int target) {
        if(start>end) {
        return -1;
        }
        int mid=start+(end-start)/2;
        //base condition
        if(arr[mid]== target) {
            return mid;
        }
        if(arr[mid]>target) {
            return search(arr, start, mid-1, target);
        }
    
           return search(arr, mid+1, end, target);
    }
}

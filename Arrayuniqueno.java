public class Arrayuniqueno
 {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,2,1,3,6,4};
        System.out.println(isUnique(arr));
    }
    //Find that number in the array that occurs once.
    static int isUnique(int[] arr) {
        int i,ans=0,length=arr.length-1;
        for(i=0;i<=length;i++) {
            ans=ans^arr[i];
        }
        return ans;
    }
    
}

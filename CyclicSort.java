import java.util.Arrays;
//Use cyclic sort when range of 1 to n is given.
//correctindex=value-1.
public class CyclicSort {
    public static void main(String[] args) {
        int[] num={3,5,2,1,4};
        System.out.println(Arrays.toString(CyclicSort(num)));
    }
    static int[] CyclicSort(int[] arr) {
        //swap first element with correct index till correct element comes at the first index.
        //then move forward for the next index.
        int i=0;
      while(i<arr.length) {
        int correctIndex=arr[i]-1;
        if(arr[i]!=arr[correctIndex]) {
            swap(arr, i, correctIndex);
        }
        else {
            i++;
        } 
      }  
      return arr;
    }
    static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

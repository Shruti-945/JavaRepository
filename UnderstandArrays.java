import java.util.Arrays;      
import java.util.Scanner;
public class UnderstandArrays {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int[] arr={1,4,6,9};
       System.out.println("Enter your choice");
       int choice=obj.nextInt();
    switch(choice) {
    case 1:
    System.out.println(Arrays.toString(swap(arr,1,3)));     
    break;
    case 2:
    System.out.println((max(arr)));
    break;
    case 3:
    System.out.println(MaxRange(arr,0,2));
    break;
    default:
    System.out.println(Arrays.toString(ReverseArray(arr)));
    }
    obj.close();
}
    //Gives the max value element in a given range
    static int MaxRange(int[] arr,int start,int end) {
      int maxVal=arr[start];
    for(int i=start;i<=end;i++) {
     if(maxVal<arr[i]) {
        maxVal=arr[i];
     }
    }
   return maxVal;
}
 //Swap 2 values at chosen indices in an array.
 
    static int[] swap(int[] num,int index1,int index2)  {
        int temp=num[index1];
        num[index1]=num[index2];
        num[index2]=temp;
        return num;   //Data type has to be mentioned when returning a value.
    }
    //Gives the max value in the array.
    static int max(int[] arr) {
       int maxVal=arr[0];
       for(int i=0;i<arr.length;i++) {
        if(maxVal<arr[i]) {
           maxVal=arr[i];
        }
       }
      return maxVal;
    }
    //Reverse the array
    static int[] ReverseArray(int[] num) {
      int start=0;
      int end=num.length-1;
      while(start<end) {
        swap(num,start,end);
        start++;
        end--;
      }
     return num;
    }
}


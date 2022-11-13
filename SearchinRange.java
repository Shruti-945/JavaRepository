import java.util.Scanner;
public class SearchinRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 element array");
        int[] arr=new int[5];
        //input
        for(int a=0;a<5;a++) {
            arr[a]=input.nextInt();
        }
        System.out.println("Search the element to be found");
        int target=input.nextInt();
        System.out.println("Enter the start range for searching");
        int start=input.nextInt();
        System.out.println("Enter the end range for searching");
        int end=input.nextInt();
        System.out.println("The target index is " +(Search(arr, target,start,end)));
        input.close();
    }
    //Return index of the target element in the array.
    static int Search(int[] arr,int target,int start,int end) {
        for(int index=start;index<=end;index++) {
            if(arr[index]==target) {
                return index;
            }
        }
      return -1;
}
}



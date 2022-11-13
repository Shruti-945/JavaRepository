//LinearSearch
import java.io.*;
import java.util.Scanner;
public class LinearSearching {
public static void  main(String[] args) {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter five array elements");
  int[] arr=new int[5];  //Array cannot be defined without size.If we're not sure about the size use arraylist.
  for(int a=0;a<5;a++) {
    arr[a]=obj.nextInt();
  }
  System.out.println("Enter your choice");
  int choice=obj.nextInt();
  switch (choice) {
  case 1:
  System.out.println("Enter the element to be found");
  int a=obj.nextInt();
  int ans=Linearsearch1(arr,a);
  System.out.print("The index of the element is ");
  System.out.println(ans);
  break;
  case 2:
  System.out.println("Enter the element to be found");
  a=obj.nextInt();
  System.out.print("The index of the element is ");
  System.out.println(Linearsearch2(arr, a));
  break;      //check this out.
  case 3:
  System.out.println("Minimum value in the array is " +min(arr));
  break;
  default:
  System.out.println("Invalid choice");
}
obj.close();
}
//Return the minimum value in the array.
static int min(int[] nums) {
    int minvalue=nums[0];
    for(int index=0;index<nums.length;index++) {
        if(nums[index]<minvalue) {
            minvalue=nums[index];
        }
}
return minvalue;
}

//search target element in the array,return element if found.
static int Linearsearch2(int arr[],int target) {
    if(arr.length==0) {
        return -1;
    }
    //search in the for loop
    for(int element:arr) {
        if(element==target) {
            return element;
        }
    }
       return -1;
     }                    
//search target element in the array,return index if found
//Return -1 if not found
static int Linearsearch1(int arr[], int target) {
    if(arr.length==0) {
        return -1;
    }
    //search in the for loop
    for(int i=0;i<arr.length;i++) {
        if(arr[i]==target) {  //A method returns the control as soon as it hits the return statement.
            return i;         //Any code after the return statement will not be executed.
        }                    //Note:If u don't want to return control to main function immediately after return statement use break instead of return.  
    }                        //When we return some value in the function,function gets over.
    //This return will exexcute if none of the above return statements have been executed.
    return -1;
}
}
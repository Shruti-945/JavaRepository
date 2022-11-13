import java.util.Scanner;
public class Arrays {
   public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++) 
        {
            arr[i]=obj.nextInt();            
            System.out.print((arr[i])+",");   //print the elements in an array.
        }
    obj.close();
   }    
}

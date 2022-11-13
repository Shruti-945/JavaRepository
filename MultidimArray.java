import java.util.Arrays;
import java.util.Scanner;
public class MultidimArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      /*   int arr[][]=new int[3][];   //first bracket for rows,second for columns
        int arr2D[][]={  //No of columns/size of individual rows in an array doesn't matter.It is taken as an array.
            {1,2,3},   //0th index array
            {4,5},     //1st index array
            {6,7,8,9}  //2nd index array. arr2D[2]={6,7,8,9}  arr2D[2][0]={6}
        }; */
        int arr[][]= new int [3][3]; //Although here 3 columns are specified, number of columns are different at different index.
        //Here total number of elements are 3*3=9.
        System.out.println("Length of Array is " +arr.length);  //gives number of rows as the rows are taken as array in one index.
        System.out.println("Print the elements in the array");
        int row,col;
         //input
       for(row=0;row<arr.length;row++) //Length of array is equal to the number of rows.
        {
            //for each column in every row
            for(col=0;col<arr[row].length;col++) {  //Every row itself is an array of size 2.
                arr[row][col]=input.nextInt();
            }
        }
        
        //output
            for(row=0;row<arr.length;row++) //Length of array is equal to the number of rows.
            {
                //for each column in every row
                for(col=0;col<arr[row].length;col++) { //Every row itself is an array of size 2.
                   System.out.print(arr[row][col] + " "); //Prints each column
                }
            System.out.println(); //Takes the cursor to the next line for the new row thus printing a matrix of 3 rows and 3 columns
            }                           

     /*  //output (check this out)
        //The code below return the same output as above in just 3 lines.
        for(row=0;row<arr.length;row++) {
            System.out.println(Arrays.toString(arr[row])); //Here 1 row is printed as an array itself.There is no concept of column here.
        }   */ 
      input.close();  
        
    }
}

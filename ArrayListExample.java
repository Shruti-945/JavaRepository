import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
      //Dynamic Array here.
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5); 
        //For ArrayList .size() function gives the length of the arraylist.
    /*     list.add(45);  //We can take as many values as we want in the array even if initial size is specified. 
        list.add(53);
        list.add(34);
        list.add(50);
        list.add(47);
        list.add(9);
        System.out.println(list); 
        System.out.println(list.contains(457));            //checks whether 457 is present in the arraylist and returns boolean value.
        System.out.println(list.set(0, 99));  //changes the value at 0th index with given value.
        list.remove(5);                               //here index should not be out of bound 
        System.out.println(list);                           //list will be updated.
      */
      System.out.println("Enter the 5 elements in the list");
      //input
      for(int i=0;i<5;i++) {
        list.add(obj.nextInt());  //Arraylist size is fixed internally.It will create a new array of say double the size afther filling some amount.
     }
     //get item at any index
     for(int i=0;i<5;i++) {
        System.out.print(list.get(i)); //pass index here. list[index] syntax will not work here.
     } 
     System.out.println(list);
        obj.close();
}
}
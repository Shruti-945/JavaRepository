import java.util.ArrayList;
import java.util.Scanner;
public class MultidimArrayList {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        ArrayList <ArrayList<Integer>> list= new ArrayList<>();
        System.out.println("Enter the elements");
        //initialization/input of inner arraylist
        for(int i=0;i<3;i++) {     //There will be 3 arraylist in the main arraylist.
            list.add(new ArrayList<>());  
        }
        //get elements
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                list.get(i).add(obj.nextInt());
            }
        }
        System.out.println(list);
    obj.close();
    }
}

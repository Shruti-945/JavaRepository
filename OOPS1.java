import java.util.Arrays;
public class OOPS1 {
    public static void main(String[] args) {
        // A class is a named group of properties and functions.
        //These are properties.
        int[] roll=new int[5];
        String[] names=new String[5];
        Student[] students=new Student[5];
        //just declaring
        Student shruti;     //reference to an object so stored in stack
        System.out.println(Arrays.toString(students));
    }
    
}
//create a class
//here student class is an object
//Student student1
//student1 is ref variable
class Student {
     int roll[]=new int[5];
     String[] name=new String[5];
     float[] marks=new float[5];
}

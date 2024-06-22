import java.util.Arrays;
public class classobj {
  public static void main(String[] args) {
    
        int[] roll=new int[5];
        float[] marks=new float[5];
        String[] names=new String[5];

        Student[] students=new Student[5];
        //just declaring
       // Student shruti;
       //   shruti=new Student();     //reference to an object so stored in stack

        Student shruti=new Student();         //constructor
        //shruti.roll=13;
        System.out.println(shruti.roll);
        System.out.println(shruti.name);
         System.out.println(shruti.marks);
    Student random=new Student(shruti);
    shruti.changeName("Shoe lover");
    shruti.greeting();

    Student one=new Student();
    Student two=one;
    one.name="something";
    System.out.println(two.name);
  }
}
  //create a class
  //here student class is an object
  //Student student1
  //student1 is ref variable
class Student {
    int roll;
    String name;
    float marks=90f;

    void greeting() {
      System.out.println("hello " +this.name);
    }
    void changeName(String newName) {
      name=newName;
    }

//we need a value to add values of the above properties object by object
//we need one word to access all object
    Student() {
      //this is how u call a constructor from other constructor
      this(10,"default",89.7f);
    }
    Student(Student other) {
      this.name=other.name;
      this.roll=other.roll;
      this.marks=other.marks;
    }
    Student(int rno,String name,float marks) {
      this.name=name;
      this.roll=rno;
      this.marks=marks;
    }


}


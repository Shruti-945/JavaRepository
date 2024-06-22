public class wrapper {
  public static void main(String[] args) {
    int a=10;
    int b=20;
    Integer num=45;
    //No swapping bcoz there is only pass by value
    swap(a,b);
    System.out.println(a+" "+b);
    //PASS BY REFERENCE OF VALUE.NO PASS BY REFERENCE IN JAVA.
    swap2(a, b);
    System.out.println(a+" "+b);
    //final int c=2;
    //c=3;  (not allowed) 
    //System.out.println(c);

    final A shruti=new A("shruti ");
    shruti.name="shruti agarwal";
   //when a non primitive is final,u cannot reassign it
    // shruti=new A("new");
  }
  //PRIMITIVES ARE PASSED
  static void swap(int a,int b) {
    int temp=a;
    a=b;
    b=temp;
  }
  //OBJECT IS PASSED
  //NO SWAPPING BCOZ INTEGER IS A FINAL CLASS.
  static void swap2(Integer a,Integer b) {
    int temp=a;
    a=b;
    b=temp;
  }
}
class A {
  final int num=10;
  String name;
  public A(String name) {
    this.name=name;
  }
}

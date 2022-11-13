import java.util.Arrays;
public class Overloading {
    public static void main(String[] args) {
    int ans=fun(9,10);
    System.out.println((ans));
    fun("Shruti","Tanu","Kavva");
    int sum=fun(3,6,9);
    System.out.println(sum);
    fun(3,4,7,8);
}
    static int fun(int a, int b) {
    return a+b;
    }
    static void fun(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static int fun(int x, int y, int z) {
    return x+y+z;        

    }
}

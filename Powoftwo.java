public class Powoftwo {
    public static void main(String[] args) {
       System.out.println(powof2(32)); 
    }
    //To check if the number is a power of 2.
    static boolean powof2(int num) {
        return (num&1)==0;
    }
}

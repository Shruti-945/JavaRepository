public class OddEven {
    public static void main(String[] args) {
        System.out.println(isOdd(20));
    }
    //Check if the number is odd.
    static boolean isOdd(int n) {
        return (n&1)==1;
    }
    
}

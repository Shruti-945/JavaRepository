public class Factorial {
    public static void main(String[] args) {
        int ans=fact(5);
        System.out.println("Factorial of 5 is "+ans);
    }    
    static int fact(int n) {
        //base condition
        if(n<=1) {
            return 1;
        }
        return n*fact(n-1);
    }
}

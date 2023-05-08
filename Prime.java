public class Prime {
    public static void main(String[] args) {
        int n=36,i;
        for(i=2;i<=n;i++) {
            System.out.println(isPrime(i));
        }
     }
    static boolean isPrime(int n) {
        int c=2;
        if(n<=1)
        return false;
        while(c*c<=n) {
            if(n%c==0)
            return false;
            c++;
        }
        return true;
    }
}

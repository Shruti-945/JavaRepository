public class SumDigits {
    public static void main(String[] args) {
        int ans=sumD(1342);
        System.out.println(ans);
    }
    static int sumD(int n) {
        //base condition
        if(n==0) {
            return 0;
        }
        return (n%10)+ sumD(n/10);
    }
}

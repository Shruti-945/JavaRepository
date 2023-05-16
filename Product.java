public class Product {
    public static void main(String[] args) {
        int ans=prod(1342);
        System.out.println("Product of digits is "+ans);
    }    
    static int prod(int n) {
        //base condition
        if(n%10==n) {
            return 1;
        }
        return (n%10)*prod(n/10);
    }
}

public class Rev {
    static int sum=0;   //Global variable
    public static void main(String[] args) {
        rev(1324);
        System.out.println(sum);
    }
    static void rev(int n) {
    int rem;
        //base condition
        if(n==0) {
            return ;
     }
     rem=n%10;
     sum=sum*10+rem;
     rev(n/10);
    }
    
}

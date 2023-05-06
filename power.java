public class power {
    //Find the value of a to the power b.
    public static void main(String[] args) {
        int ans=1,base=3,power=6;
        while(power>0) {
            if((power&1)!=0) 
            ans*=base;
            base*=base;
            power=power>>1;
        }
        System.out.println(ans);
    
    }
}

public class Noofdigits {
    public static void main(String[] args) {
       System.out.println(digits(4,2));
    }
    //Find the number of digits in a particular number system.
    static int digits(int num,int base)
    {
        int digits=(int)(Math.log(num)/Math.log(base))+1;
        return digits;
    }
}

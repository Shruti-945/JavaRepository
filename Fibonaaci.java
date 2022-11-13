import java.util.Scanner;
public class Fibonaaci {
    public static void main(String[] args) {
        System.out.println("Enter the first two numbers");
        Scanner obj= new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("Enter the number of the digit to be found");
        int n=obj.nextInt();
        int count=2;
        while(count<=n) {
           int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
        obj.close();
    }
    
}

public class Shadowing {
    static int x=90; 
    public static void main(String[] args) {
        System.out.println(x);  //90
        int x=40;   //Higher scoped variable will be shadowed by this.Scope will begin when value is declared.
        System.out.println(x);  //40
        calc();     /*Value 40 only scoped for the inner block */
    } 
    static void calc() {
        System.out.println(x);

    }
}

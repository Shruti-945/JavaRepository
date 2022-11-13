class Scoping
{
    public static void main(String[] args) 
    {
        String message=greet();   /*greet() function is called ,return gives the output */
        System.out.println(message);        
    }
    
    static String greet() 
    {
        String greeting="How r u"; /*greeting can be accessed within greet() function only.This is scoping. */
        return greeting;           /*Any change in this will only be in the scope of this function */
    } 
}
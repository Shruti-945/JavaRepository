import java.util.Scanner;
import java.io.*;
//Search a character in a String.
public class SearchinString {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string");
        String word=obj.nextLine();
        System.out.println("Enter the character to be found");
        //How to take character input in Scanner class.
        char target=obj.next().trim().charAt(0);   
        System.out.println("Index of the target character is " + characterSearch(word, target));
        //System.out.println(Arrays.toString(word.toCharArray())).
        //then check with indexing.
    }
    static int characterSearch(String word, char target) {
        for(int index=0;index<word.length();index++) {
            if(word.charAt(index)==target) {
                return index;
            }
        }
      return -1;
}
}

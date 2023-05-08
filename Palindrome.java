public class Palindrome {
    public static void main(String[] args) {
        String str="palap";
    System.out.println(isPalin(str));
    }
    static boolean isPalin(String str) {
    if(str.length()==0 || str==null) {
        return true;
    } 
     for(int i=0;i<=str.length()/2;i++) {
        if(str.charAt(i)!=str.charAt(str.length()-1-i))
        {
            return false;
        }
    }
    return true;
    }
}

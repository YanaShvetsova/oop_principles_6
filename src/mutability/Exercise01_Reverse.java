package mutability;

public class Exercise01_Reverse {
     /*
    Write a method that takes a String and returns it back reversed

    Hello -> olleH
    Java -> avaJ
      ->
    a  -> a
    1234 -> 4321
    Good morning -> gninrom dooG
      */

    public static String reverseString(String str) {
        StringBuilder sBuild = new StringBuilder(str);
        return sBuild.reverse().toString();
        //one line: return new StringBuilder(str).reverse().toString();
    }

    /*
    Write a method that takes a String and returns true/false
    return true if it is palindrome
    return false if it is not palindrome

    civic -> true
    madam -> true
    hello -> false
     */
    public static Boolean isPalindrome(String str) {
        StringBuilder sB = new StringBuilder(str);
        return sB.reverse().toString().equals(str);
        //one lane:
    }


    public static void main(String[] args) {
        //Reverse
        System.out.println(reverseString("Hello"));

        //isPalindrome
        System.out.println(isPalindrome("civic"));

    }
}

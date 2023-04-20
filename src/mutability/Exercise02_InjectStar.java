package mutability;

public class Exercise02_InjectStar {
/*
Create a method that takes a String and returns a String
    if the given String have even length and length is at least 2, then insert * in the middle of the String
    aa -> a*a
    java -> ja*va
    toyota -> toy*ota


    if the given String has odd length and length is at least 3, then insert * in before and after the middle character
    aaa -> a*a*a
    hello -> he*l*lo
 */
    public static String injectStar(String str){
        StringBuilder sB = new StringBuilder(str);
        if (sB.capacity() < 2) return "";
        else if (sB.capacity() % 2  == 0) return sB.insert(str.length()/2, "*").toString();
        else return sB.insert(str.length()/2, "*").insert(str.length()/2+2, "*").toString();
    }
    //from Akin without builder
    /*
    public static String injectStar(String str){
    if(str.length() <= 1) return "";
    else if(str.length() % 2 == 0) return  str.substring(0, str.length()/2) + "*" + str.substring(str.length()/2);
    return str.substring(0, str.length()/2) + "*" + str.charAt(str.length()/2) + "*" + str.substring(str.length()/2+1);
}
     */

    public static void main(String[] args) {
        System.out.println(injectStar("hello"));
    }
}

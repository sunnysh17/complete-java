public class RegularExpressions{
    public static void main(String[] args) {
        String str1 = "a";
        System.out.println(".: " + str1.matches(".")); //Any character, but it must be single character.
        
        System.out.println("[abc] " + str1.matches("[abc]")); //Must be single character among either a, b, c.
        
        System.out.println("[^abc]"+str1.matches("[^abc]")); //Must be single character other from either a, b, c.
        
        System.out.println("[a-zA-Z1-9]"+str1.matches("[a-zA-Z1-9]")); //Must be single character, from range a to z OR 1 to 9.
        
        System.out.println("[a-z][0-9]"+str1.matches("[a-z][0-9]")); //Must be two character, from range a to z OR 1 to 9.
        //order matters, 1st character must be a-z and 2nd character must be 0-9.

        System.out.println("a|b "+str1.matches("a|b")); //Must be single character either a or b.
        
        System.out.println("abc "+str1.matches("abc")); //Must be exactly abc.

        //MetaCharacters
        System.out.println("\\w: " + str1.matches("\\w")); //Alphanumerics
        System.out.println("\\d: " + str1.matches("\\d")); //digits
        System.out.println("\\s: " + str1.matches("\\s")); //space

        //Quantifiers
        String str2 = "caba";
        System.out.println("* " + str2.matches(".*")); //Any letters any number of time including space
        System.out.println("* " + str2.matches("[a-z]*")); //Any letters any number including space
        System.out.println("+ " + str2.matches("[abc]+")); //abc one or more than one times
        System.out.println("? " + str2.matches("[abc]?")); //abc zero or one than one times
        System.out.println("[abc]{X} " + str2.matches("[abc]{3}")); //contains abc but with length 3
        System.out.println("[abc]{X,Y} " + str2.matches("[abc]{3,5}")); //contains abc but with length 3 to 5

        String str3 = "john@gmail.com";
        System.out.println("Email: " + str3.matches(".*gmail.*")); //At sign
        System.out.println("Email: " + str3.matches("\\w*@gmail(.*)")); //At sign



    }
}
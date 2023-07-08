public class StringMethods1{
    
    public static void main(String[] args) 
    {
        String str = new String("netbeans"); 
        //length
        System.out.println("length: " + str.length()); //Blank Spaces are also counted in length

        //toLowerCase & toUpperCase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        //trim - Removes leading and trailing spaces
        String str1 = "    Welcome    ";
        System.out.println(str1.trim());

        //substring
        String str2 = "My Name is Sunny"; //Blank Spaces are also counted as indexes
        System.out.println(str2.substring(0,2));
        System.out.println(str2.substring(2,3));

        //replace
        String str4 = "Welcome";
        System.out.println(str4.replace('e','k'));
    }
}
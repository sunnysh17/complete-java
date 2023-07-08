public class StringMethods2{
    public static void main(String[] args) 
    {
        String str = "Mr. Shahrukh Khan";
        //Start with
        System.out.println(str.startsWith("Mr."));
        
        //End with
        System.out.println(str.endsWith("Khan"));

        //char charAt(int index)
        System.out.println("charAt: " + str.charAt(4));

        //int indexOf(String str)
        System.out.println("indexOf: " + str.indexOf("Shah"));

        //int lastIndexOf(String str)
        System.out.println("lastIndexOf: " + str.lastIndexOf("Shah"));

        String str1 = "www.udemy.com";
        System.out.println(str1.indexOf("."));
        System.out.println(str1.lastIndexOf("."));

       
    }
}
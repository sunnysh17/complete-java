public class StringPractice{
    public static void main(String[] args) 
    {
        String str1 = "Java Program";
        System.out.println(str1);

        String str2 = new String("JAVA"); // Will be created in HeapMemory
        System.out.println(str2);

        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c); //Convert char array to String
        System.out.println(str3);

        byte b[] = {65,66,67,68};
        String str4 = new String(b); //Convert byte array to String
        System.out.println(str4); //ABCD

        String str5 = new String(b,2,2); //Start from index 2 and we want 2 letters
        System.out.println(str5); 
        
    }
}

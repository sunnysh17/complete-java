public class StringMethods3{
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Java";
        String str3 = "abhishek";
        String str4 = "balaji";
        String str5 = new String("java");

        
        //boolean equals(String s)
        System.out.println("equals(): " + str1.equals(str2));
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));
        System.out.println("compareTo(): " + str3.compareTo(str4)); // -1
        
        System.out.println(str1 == str2);

        System.out.println(str1 == str5);
        
        //boolean contains(String s)
        String str6 = "The Great Wall of China";
        System.out.println("contains(): " + str6.contains("Wall"));


        String str7 = "Hare ";
        String str8 = "Krishna";
        System.out.println(str7.concat(str8));
        System.out.println(str7 + str8);

        //String valueOf() - convert any type of data to String type

    }
}
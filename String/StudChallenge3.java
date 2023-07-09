public class StudChallenge3{

    public static void main(String[] args) {
        
        //Remove Special Characters from a string
        String str = "a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        //Remove Extra Spaces from a string
        
        String str1 = "  abc   de fgh    ijk   ";
        //System.out.println(str1.replaceAll("\\s+","").trim());

        str1 = str1.replaceAll("\\s+"," ").trim();

        //Find number of words in a string
        String words[] = str1.split("\\s"); //Split string into array of words
        System.out.println(words.length);



    }
}
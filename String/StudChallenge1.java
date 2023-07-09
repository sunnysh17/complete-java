public class StudChallenge1{
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int sep = str.indexOf('@');
        System.out.println(sep);

        String usernameString = str.substring(0,sep);
        System.out.println("Domain: " + usernameString);

        String domainString = str.substring(11);
        System.out.println("Domain: " + domainString);
        
        if(str.contains(domainString)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
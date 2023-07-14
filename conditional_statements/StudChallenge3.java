import java.util.Scanner;
public class StudChallenge3{
    public static void main(String[] args) {
        String url = "https://www.google.edu";

        int colon = url.indexOf(":");
        String colonSub = url.substring(0,colon);

       
        //System.out.println(typeSub);

        if(colonSub.equals("https")){
            System.out.println("https - Hypertext Transfer Protocol Secure");
        }
        else if(colonSub.equals("ftp")){
            System.out.println("ftp - File Transfer Protocol");
        }


        int type = url.lastIndexOf(".");
        String typeSub = url.substring(type+1);

        if(typeSub.equals("com")){
            System.out.println("com - Commercial");
        }
        else if(typeSub.equals("edu")){
            System.out.println("edu - Education");
        }
        else if(typeSub.equals("net")){
            System.out.println("net - Networking");
        }
        

    }
}
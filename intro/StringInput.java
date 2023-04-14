/**
 * StringInput
 */
import java.util.*;
public class StringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in is a object attached to keyboard
        String name;
        System.out.println("May I know your name?: ");
        name = scanner.nextLine();
        System.out.println("Welcome " + name);
    }
    
}
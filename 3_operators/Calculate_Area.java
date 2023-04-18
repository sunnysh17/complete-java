// calculate area of a triangle with given 3 sides
import java.util.Scanner;
class Calculate_Area {  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the sides of a triangle a,b,c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float s = (a + b + c) / 2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is: " + area);
    }
}
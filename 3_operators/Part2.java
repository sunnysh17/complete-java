// Increment & Decrement Operators
class Part2{
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Post Increment: " + (x++));
        System.out.println("Pre Increment" + (++x));

        int a = 5;
        int y = a++; // First Assign & then Increment
        System.out.println("y: " + y); // 5
        System.out.println("a: " + a); // 6

        int b = 5;
        int z = ++b; //First Increment & then Assign
        System.out.println("z: " + z); 
        System.out.println("b: " + b); 

        //incrementing character
        char c = 'A';
        c++;
        System.out.println("c: " + c);

        // Expression
        int e = 5, f = 4, r;
        r = 2*e++ + 3 * ++f;
        System.out.println("Expression (r): " + r);
        
    }
}
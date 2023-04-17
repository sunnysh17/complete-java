// Literals in java
class Part3 {
    public static void main(String[] args) {
        //literals are constant in java
        byte a = 10;
        byte b = 0b1010; //binary
        byte o = 012; //octal
        byte h = 0xA; //hexadecimal

        //In java we can separate bigger numbers using underscores
        long e = 1_000_000_000_000L;

        System.out.println(a);
        System.out.println(b);
        System.out.println(o);
        System.out.println(h);
        System.out.println(e);


    }
}
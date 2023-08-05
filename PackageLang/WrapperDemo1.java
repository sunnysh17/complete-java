package PackageLang;

public class WrapperDemo1 {
    public static void main(String[] args) {
        int m1  = 15;
        Integer m2 = Integer.valueOf("123");
        Integer m3 = Integer.valueOf("1010",2);
        Integer m4 = Integer.decode("0xA7");
        System.out.println(Integer.parseInt("123"));
        System.out.println(m3); //10 in decimal
        System.out.println(m4); //10 in decimal

    }
}

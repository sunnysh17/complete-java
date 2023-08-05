package PackageLang;

public class WrapperDemo2 {
    public static void main(String[] args) {
        float a = 12.5f;
        Float b = -12.5f/0;
        Float c = (float)Math.sqrt(-1);
        System.out.println(b.equals(a)); //true
        System.out.println(b.isInfinite()); //true
        System.out.println(b==Float.POSITIVE_INFINITY); //true
        System.out.println(b==Float.NEGATIVE_INFINITY); //true
        
        System.out.println(c.isNaN()); //true
    }
}

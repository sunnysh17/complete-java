package PackageLang;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("15");
        byte bb = 14;
        Byte e = Byte.valueOf(bb);

        Short f = Short.valueOf("123");

        Float g = 12.3f;
       

        Double i1 = Double.valueOf(123.46);

        Character k = Character.valueOf('A');
        Character k1 = 'B';

        Boolean l = Boolean.valueOf(true);

        Float h = Float.valueOf("23.3f"); //object of float 
        float x = h.floatValue(); //from object we are getting primitive - unboxing
        float y=h; //same as above line, automatically floatValue() will be called 



        
    }
}

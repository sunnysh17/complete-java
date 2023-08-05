package PackageLang;
import java.lang.*;

class MyObject{
    public String toString() {

        return "My Object";
    }

}

public class LangDemo {
        public static void main(String[] args) {
            MyObject o1 = new MyObject();
            System.out.println(o1.toString());
          
        }
}

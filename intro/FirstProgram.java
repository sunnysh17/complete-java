public class FirstProgram{  //class name should be same as file name.
    public static void main(String[] args) { //main is starting point of program.
        //In order to make the main methid acessible to JVM we need to declare public.
        //static - If we want to use anything from the class without creating a object then that shuld be declared as static.

        System.out.println("Hello World!");
//      class  object method()
        System.out.println(args[0]); //command line arguments.
    }
}
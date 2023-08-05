public class StaticPractice2 {
    static{
        System.out.println("Block 1");
    }
    public static void main(String[] args){
        System.out.println("Main"); //Executed afet
    }

    static{
        System.out.println("Block 2");
    }
}

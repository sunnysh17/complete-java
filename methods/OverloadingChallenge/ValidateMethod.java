public class ValidateMethod{
    
    static boolean validate(String name){
        
        if(name.matches("[a-zA-Z\\s]+"))
        {
           return true;
        } 
        else
        {
            return false;
        }
           
    }

    static int validate(int age){
        if(age > 18){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
    public static void main(String[] args) {

        System.out.println(validate(19));
    }
}
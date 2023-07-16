public class Method1{
                   //Formal Parameters
    int maxNum(int x, int y){  //Signature/Header 
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }

    public static void main(String[] args) {
       
        Method1 m = new Method1(); //2nd way, if no static is specified in method
        int a=1,b=2,c; 
        //Actual Parameters
        System.out.println("Max: "+ m.maxNum(a, b));
    }
}
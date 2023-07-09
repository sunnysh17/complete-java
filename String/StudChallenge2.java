public class StudChallenge2{

    public static void main(String[] args) {
        //Find if a number is binary or not
        String num1 = "10110001";
        System.out.println(num1.matches("[0-1]+"));
        System.out.println(num1.matches("[01]+"));

        //Find if a number is hexadecimal or not
        String num2 = "6C";
        System.out.println(num2.matches("[0-9A-F]+"));

        //Find the data in Date format(dd/mm/yyyy)
        String date1 = "03/12/2020";
        System.out.println(date1.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));
    }
}
class Student{
    public int rollno;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){

        return m1+m2+m3;
    }
    public double average(){
        return (m1+m2+m3)/3.0;
    }
    public char grade(){
        if(average() >= 60){
            return 'A';
        }
        else{
            return 'B';
        }
    }
    
    public String details(){
        return "Roll No: " + rollno + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
    }

    public String toString(){
        return "Roll No: " + rollno + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
    }

}

public class Student1{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "Sunny";
        s1.course = "CSE";
        s1.m1 = 90;
        s1.m2 = 80;
        s1.m3 = 70;

        System.out.println("Total: " + s1.total()); 
        System.out.println("Average: " + s1.average());
        System.out.println("Details: \n" + s1.details());
        System.out.println("---------------------------------------");
        //When we have to print the object itself, then the object should have toString() method implemented.
        System.out.println("Details: \n" + s1);

       
    }
}
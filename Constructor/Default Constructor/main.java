// class name: student
class student{
    int id;
    String name;
    //default constructor
    student(){
        System.out.println("Default constructor called");
    }
}
public class main {
    public static void main(String[] args) {
        // Your code here
        student s1 = new student();//creating an object of student
        // this will call the default constructor

    }
}
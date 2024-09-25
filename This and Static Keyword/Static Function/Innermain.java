class student{
    int roll;
    String name;
    static String college = "LU"; // Static variable, Kind of global variable
    student(int r, String n){
        roll = r;
        name = n;
    }
    static void changeclg(){
        // You can't access non-static members in static method
        // roll = 5; // Error
        college = "Leading University!";
    }
}
public class Innermain {
    public static void main(String[] args) {
        student s1 = new student(101, "Anik");
        student s2 = new student(102, "Rahman");
        //in java, static variable is shared among all objects
        // static var can be accessed by class name or object name
        System.out.println(s1.roll + " " + s1.name + " " + student.college);
        System.out.println(s2.roll + " " + s2.name + " " + s1.college);
        student.changeclg();
        System.out.println(s1.roll + " " + s1.name + " " + s2.college);
    }
}
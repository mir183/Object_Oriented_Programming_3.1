// Class
class student{
    int id;
    String name;
}

public class main {
    public static void main(String[] args) {
        // Your code here
        // object creation
        student s1 = new student();
        s1.id = 101; // initializing object with reference
        s1.name = "Mir";// initializing object with reference
        System.out.println("Student id is: "+s1.id);
        System.out.println("Student name is: "+s1.name);
        
    }
}
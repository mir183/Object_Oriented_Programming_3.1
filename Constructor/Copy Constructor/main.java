//class 
class stuent {
    int id;
    String name;
    // Default constructor, we need a default constructor to create an object
    stuent() {}

    // Copy constructor
    stuent(stuent s) {
        id = s.id;
        name = s.name;
    }
}

public class main {
    public static void main(String[] args) {
        // Your code here
        stuent s1 = new stuent();
        s1.id = 1;
        s1.name = "John";
        stuent s2 = new stuent(s1);
        System.out.println(s2.id + " " + s2.name);
    }
}
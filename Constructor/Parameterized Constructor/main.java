//class
class student{
    //instance variable
    int id;
    String name;
    // Parameterized constructor
    student(int i, String n){
        id = i;
        name = n;
    }
}
public class main {
    public static void main(String[] args) {
        // Your code here
        student s1 = new student(101, "Kabir");
        student s2 = new student(102, "Rahul");
        // we can also create object like this
        // we have to pass the value in the same sequence as the constructor
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
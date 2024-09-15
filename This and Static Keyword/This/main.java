class student{
    int id;
    String name;
    //this keyword is used to refer to the current object
    //when parameters have the same name as instance variables
    student(int id, String name){
        this.id = id;
        this.name = name;

    }
}

public class main {
    public static void main(String[] args) {
        // Your code here
        student s1 = new student(1, "John");
        student s2 = new student(2, "Jane");
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
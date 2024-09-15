class student{
    int id;
    String name;
    static int count = 0;
    // its like a global variable, it is shared by all objects of the class
    student(){
        System.out.println("Constructor called");
        count++;
    }
    student(int id, String name){
        this.id = id;
        this.name = name;
        count++;
    }
    student(student s){
        this.id = s.id;
        this.name = s.name;
        count++;
    }

}

public class main {
    public static void main(String[] args) {
        // Your code here
        student s1 = new student();
        student s2 = new student(1, "John");
        student s3 = new student(s2);
        System.out.println("Number of students: " + student.count);

    }
}
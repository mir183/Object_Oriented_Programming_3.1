class person {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class teacher extends person {
    String qualification;
    @Override void display() {
        super.display();
        System.out.println("Qualification: " + qualification);
    }
}

public class main {
    public static void main(String[] args) {
        // Your code here
        teacher t = new teacher();
        t.name = "John";
        t.age = 30;
        t.qualification = "Masters";
        t.display();
    }
}
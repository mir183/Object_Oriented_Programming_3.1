class person{
    String name;
    int age;
    //default constructor
    person(){
        name = "unknown";
        age = 0;
    }
    //parameterized constructor
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Your code here
        person p1 = new person();
        person p2 = new person("John", 30);
        System.out.println("Name: " + p1.name + " Age: " + p1.age);
        System.out.println("Name: " + p2.name + " Age: " + p2.age);
    }
}

// java will automatically call the default constructor if no constructor is defined in the class.
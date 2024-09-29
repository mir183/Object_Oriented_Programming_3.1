class Variable {
    int num = 10;
}

class Check extends Variable {
    int num = 20;

    void display() {
        System.out.println("Local variable: " + num);//20
        System.out.println("Instance variable: " + super.num);//10
    }
}

public class main {
    public static void main(String[] args) {
        Check obj = new Check();
        obj.display();
    }
}
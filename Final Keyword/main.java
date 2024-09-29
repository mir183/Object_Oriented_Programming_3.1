class test{
    final int a = 10; // final variable, can't be changed
    final void display(){
        System.out.println("Final method");
        System.out.println("Value of a: " + a);
    }
}
public class main {
    public static void main(String[] args) {
        // Your code here
        test obj = new test();
        obj.display();
        // obj.a = 20; // error, can't change final variable
    }
}

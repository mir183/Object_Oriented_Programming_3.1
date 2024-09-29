class a{
    void display(){
        System.out.println("This is a class A");
    }
}
class b extends a{
    void display(){
        System.out.println("This is a class B");
        super.display();
    }
}

public class main {
    public static void main(String[] args) {
        // Your code here
        b obj = new b();
        // obj.display(); //initially it'll print "This is a class B"
        a obj1 = new a();
        // obj1.display(); //it'll print "This is a class A"

        b obj2 = new b();
        obj2.display(); //it'll print "This is a class B" and "This is a class A" (BOTH)
        /*
        if we call the display method of class B,
        it'll print "This is a class B" and then 
        it'll call the display method of class A
         */
    }
}
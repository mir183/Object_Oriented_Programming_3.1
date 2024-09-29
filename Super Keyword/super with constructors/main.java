class animal{
    animal(){

        System.out.println("Animal is created");
    }
}

class dog extends animal{
    dog(){
        super();// eta na dileo hobe, same kaj kore ekhane
        System.out.println("Dog is created");
    }
}

public class main {
    public static void main(String[] args) {
        // Your code here
        dog d = new dog();//this will print "Animal is created" and "Dog is created" (BOTH)
        
    }
}
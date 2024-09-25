class father{
    int wealth = 1000;
    String company = "ABC";
}
class son1 extends father{
    //inheritated wealth and company
}
class son2 extends father{
    //inheritated wealth and company
}
class son3 extends father{
    //inheritated wealth and company
}

public class main {
    public static void main(String[] args) {
        // Your code here
        son1 s1 = new son1();
        son2 s2 = new son2();
        son3 s3 = new son3();
        System.out.println("Son1 wealth: " + s1.wealth + " Company: " + s1.company);
        System.out.println("Son2 wealth: " + s2.wealth + " Company: " + s2.company);
        System.out.println("Son3 wealth: " + s3.wealth + " Company: " + s3.company);
    }
}
class father{
    int wealth = 1000;
    String comnpanyname = "ABC";
}
class son extends father{
    // single inheritance
}

class grandson extends son{
    // multi-level inheritance
}

public class main {
    public static void main(String[] args) {
        // Your code here
        grandson g = new grandson();
        System.out.println("Company Name: "+g.comnpanyname);
        System.out.println("Wealth: "+g.wealth);
    
    }
}
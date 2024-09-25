class father{
    int wealth = 1000000;
    String companyName = "ABC";
}

class son extends father{
    // dekha jacche na bole nei naki 
}

public class main {
    public static void main(String[] args) {
        // Your code here
        son s = new son();
        System.out.println(s.wealth);
        System.out.println(s.companyName);
    }
}
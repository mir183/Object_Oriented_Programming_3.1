class father{
    int wealth = 1000;
    String company="ABC";
}
class son extends father{
    // inherit the properties of father
}
class daughter extends father{
    // inherit the properties of father
}
class grandshon extends son{
    // inherit the properties of son and father
}
public class main {
    public static void main(String[] args) {
        // Your code here
        father f = new father();
        son s = new son();
        daughter d = new daughter();
        grandshon g = new grandshon();
        System.out.println("Father's wealth: "+f.wealth+" Company: "+f.company);
        System.out.println("Son's wealth: "+s.wealth+" Company: "+s.company);
        System.out.println("Daughter's wealth: "+d.wealth+" Company: "+d.company);
        System.out.println("Grandson's wealth: "+g.wealth+" Company: "+g.company);
    }
}
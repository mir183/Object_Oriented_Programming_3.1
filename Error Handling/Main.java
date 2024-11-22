public class Main {
    public static void main(String[] args) {
        // Your code here
        String a=null;
        try{
            char c=a.charAt(0);//Error cause of null pointer exception
            System.out.println(c);   
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch(Exception e){
            System.out.println("Exception");
        }finally{
            System.out.println("Finally block");
        }
    }
}
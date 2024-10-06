public class main {
    public static void main(String[] args) {
        int sum1 = add(1, 2); //1
        int sum2 = add(1, 2, 3); //2
        float sum3 = add(1.0f, 2.0f); //3

        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);
    }

    public static int add(int a, int b) {
        return a + b;//1
    }

    public static int add(int a, int b, int c) {
        return a + b + c;//2
    }

    public static float add(float a, float b) {
        return a + b;//3
    }
}

// java will call the correct method based on the number of arguments and the type of arguments.
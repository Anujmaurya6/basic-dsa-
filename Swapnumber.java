public class Swapnumber {
    public static void main(String[] args) {
        int a = 23;
        int b = 0;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}



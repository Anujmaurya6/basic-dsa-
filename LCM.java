public class LCM {


    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int gcd = 1; // GCD ko 1 se start karte hain

        // Dono me jo chhota number hai, wahi tak loop chalayenge
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i; // Jab dono number i se divide ho jayein, wahi GCD hai
            }
        }

        // LCM ka formula
        int lcm = (a * b) / gcd;

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}

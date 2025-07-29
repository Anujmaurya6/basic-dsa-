public class Binarytodecimal {
    public static void main(String[] args) {
       /* // Binary string input
        String binary = "11011";  // Binary ka matlab: 1×2⁴ + 1×2³ + 0×2² + 1×2¹ + 1×2⁰

        // Java ka built-in method to convert binary (base 2) string to decimal (base 10)
        int decimal = Integer.parseInt(binary, 2);  // '2' means yeh base-2 ka number hai

        // Output the converted decimal value
        System.out.println("Decimal: " + decimal);  // Output: Decimal: 27
    }
}*/
String binary="1010";
int decimal=0;

int power=0;
for(int i=binary.length()-1;i>=0;i--){
    char bit=binary.charAt(i);
    if(bit=='1'){
        decimal+=Math.pow(2,power);
    }
    power++;
}
System.out.println("the binarytodecimal is"+decimal);

    }
}

public class HexdecimalToBinary {
    public static void main(String[] args) {
        String hex="1F";
        int decimal=Integer.parseInt(hex,16);//hex to decimal
        String binary=Integer.toBinaryString(decimal);//decimal to binary
        System.out.println("Binary"+binary);
    }
}

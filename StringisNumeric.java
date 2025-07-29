public class StringisNumeric {
    public static void main(String[] args) {
        String str="wfewp";

        boolean isNumeric=str.matches("\\d+");

        System.out.println("IS numerics"+isNumeric);

    }
}

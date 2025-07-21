public class CheckifStringisNumeric {
    public static void main(String[] args) {
        String str="lqwnf";

        boolean isNumeric=str.matches("\\d+");

        if(isNumeric){
            System.out.println("String is numeric");
        }else{
            System.out.println("String is not numeric");
        }
    }
}

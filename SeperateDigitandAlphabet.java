public class SeperateDigitandAlphabet {
    public static void main(String[] args) {
        String str="24qdsvcdsf234sdfdfg345";

        StringBuilder digits=new StringBuilder();
        StringBuilder letters=new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isDigit(ch))digits.append(ch); //check digit
            else if(Character.isLetter(ch)) letters.append(ch);//check alphabet
        }
        System.out.println("Digits"+digits);
        System.out.println("Alphabets"+letters);
      }
    }  

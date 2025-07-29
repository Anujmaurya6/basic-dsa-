public class CapitalizeFirstletter {
    public static void main(String[] args) {
        String str="hello world from java";

        String[] words=input.split(" ");//lambe sentence ko tukdo me tod rha he bas
        
        StringBuilder result=new StringBuilder();

        for(String word:words){//loop over each word
            if(!word.isEmpty()){//avoid empty string
            result.append(Character.toUpperCase(word.charAt(0)))//pehla letter capital karlia
            .append(word.substring(1)).append(" ");//add space after word 
            }
        }
        System.out.println("Capitalized:"+result.toString().trim());
    }
}

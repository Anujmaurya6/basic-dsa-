public class REverseWordsinSTring {
   
    public static void main(String[] args) {
        String sentence = "I love java";

        String[] words = sentence.split(" ");

        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

}
//idhar me split ek built in functions jisme hum basically 
//jaha jaha space he us basis par todte he bas aki mera partiocualr words reverse hojaye ok 
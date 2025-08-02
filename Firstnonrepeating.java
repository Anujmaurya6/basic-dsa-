public class Firstnonrepeating {
    public static void main(String[] args) {
        String str="abbbccdeeff";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(str.indexOf(ch)==str.lastIndexOf(ch)){//us character ka first index kidhar mila or us character ka last index kidhar mila bas yehi he 
                System.out.println("First non-repeating Character is:"+ch);
                break;
            }
        }
    }
    
}

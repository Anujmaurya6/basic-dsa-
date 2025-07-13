public class Main{
    public static void main(String[] args) {
        String str="Anuj Maurya";
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.println("the reverse of the String is:"+reversed);
    }
}
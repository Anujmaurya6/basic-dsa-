public class ReverseAlinkedlistUsingArray {
    public static void main(String[] args) {
        int [] list={1,2,3,4,5};
        
        System.out.println("Reversed List:");

        for(int i=list.length-1;i>=0;i--){
            System.out.println(list[i]+" ");
        }
    }
}

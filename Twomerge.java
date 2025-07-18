public class Twomerge {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        //dono ka size jodkar naya array banao
        int[] merge=new int[arr1.length+arr2.length];
        //pehle arr1 ke elements daale
        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }
        //phir arr2 ke elements daale
        for(int i=0;i<arr2.length;i++){
            merge[arr1.length+i]=arr2[i];
        }
        System.out.println("Merged Arrays:");
        for(int num:merge){
        System.out.println(""+num);
        }
    }
}

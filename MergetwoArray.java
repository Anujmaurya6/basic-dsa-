
public class MergetwoArray {
    public static void main(String[] args) {
        
    int[]a={1,3,5,7};
    int[]b={2,4,6,8,10};
    int [] merged=new int[a.length+b.length];

    for(int i=0;i<a.length;i++){
      merged[i]=a[i];
    }

    for(int i=0;i<b.length;i++){
      merged[b.length+1]=b[i];
    }
    System.out.println("Merged Array:");
    for(int i=0;i<merged.length;i++){
      System.out.println(""+merged[i]);
    }
    }
}


import java.util.Arrays;
public class MergetwoArray {
    public static void main(String[] args) {
        
    
    int [] a={1,2,3};
    int [] b={4,5,6};

    int [] merged=new int[a.length+b.length];
  System.arraycopy(a, 0, merged, 0, a.length); // Copy first array
  System.arraycopy(b, 0, merged, a.length, b.length); // Copy second array

  Arrays.sort(merged);
  System.out.println("Merged and sorted arrray are:"+Arrays.toString(merged));

    }
}

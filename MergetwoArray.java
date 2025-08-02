
import java.util.Arrays;


public class MergetwoArray {
    /*public static void main(String[] args) {
        
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
}*/
//uppar ka code mera idhar ache he but jyada previlent nhi he
//niche ka code mera idhar basically built in function ka use kar rha he jo jyada better he bas
public static void main(String[] args) {
  int[]a={1,3,5,7};
  int[]b={2,4,6,8,10};
  
  int[]merged=new int[a.length+b.length];

  System.arraycopy(a,0,merged,0,a.length);
  System.arraycopy(b,0,merged,a.length,b.length);
  System.out.println("Merged Array"+Arrays.toString(merged));
}
}
import java.util.HashSet;
public class DuplicatesArray {
    public static void main(String[] args) {
        
    
    int [] arr={1,3,2,3,4,5,1};

    HashSet<Integer> set=new HashSet<>();

    System.out.println("Duplicates Element is:");
    for(int num:arr){
        if(set.contains(num)){
            System.out.println(""+num);
        }else{
            set.add(num);
        }
    }

}
}
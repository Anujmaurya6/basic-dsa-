import java.util.HashSet;
public class DuplicatesArray {
    public static void main(String[] args) {
        int []arr={2,3,3,3,3,4,4,5,6,6,7,8,9,8,7,6,5,4,3,};
HashSet<Integer> set=new HashSet<>();
 
for(int num:arr){
    if(!set.add(num)){
        System.out.println("the duplicates are:"+num);
    }
}

    }}
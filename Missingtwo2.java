public class Missingtwo2 {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={4,5,6};

        int[] merged=new int[a.length+b.length];

        int i=0;
        int j=0;
        int k=0;
    
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                merged[k]=a[i];
                i++;
            }else{
                merged[k]=b[j];
                j++;
            }
            k++;
        }
        //agar element bache he then unko bhi add karo
        while(i<a.length){
            merged[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            merged[k]=b[j];
            j++;
            k++;
        }
        System.out.println("Merged Array using Two Pointers:");
        for(int num:merged){
            System.out.println(""+num);
        }
    }

}

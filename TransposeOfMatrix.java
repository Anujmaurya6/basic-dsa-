public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] mat={
         
        {1,2,3},
        {4,5,6}

        };
        System.out.println("Transpose of Matrix is:");
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.println(mat[j][i]+" ");
            }
            System.out.println();

        }
    }
}

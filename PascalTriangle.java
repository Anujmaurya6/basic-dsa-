public class PascalTriangle {
     public static void main(String[] args) {
        int n=5;

        //outer loop for loops
        for(int line=1;line<=n;line++){
            int num=1;
    
        }
       //print spaces for alignment
        for(int j=0;j<n-line;j++){
            System.out.println(" ");
        }
       //print number using binomial coefficient
       for (int i = 1; i <= line; i++) {
                System.out.print(num + " ");
                num = num * (line - i) / i; // Update number
            }

            // Move to next line
            System.out.println();
        
     }
}

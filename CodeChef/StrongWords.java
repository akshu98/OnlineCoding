import java.util.Scanner;

public class StrongWords{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int noOfTestCases = sc.nextInt();

        int loopVar;

        for (loopVar=0; loopVar < noOfTestCases; loopVar++)
        {
            String isStrong = "NO";
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            
           int[] nonStarIndices = new int[n];

           int i;
           int nonStarIndicesLength=0;

           for(i=0; i<n; i++){
               if (s.charAt(i)!='*'){
                   nonStarIndices[nonStarIndicesLength] = i;
                   nonStarIndicesLength += 1;
               }

           }

           for(i=0; i<nonStarIndicesLength-1; i++){
                if(nonStarIndices[i+1] - nonStarIndices[i] - 1 >= k){
                    isStrong = "YES";
                    break;
               }
           }

           System.out.println(isStrong);
        }

        sc.close();
        
    }
}
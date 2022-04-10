import java.util.Scanner;
import java.lang.Math;

public class RentOrBuy{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int noOfTestCases = sc.nextInt();

        int loopVar;

        for (loopVar=0; loopVar < noOfTestCases; loopVar++)
        {
            double n = sc.nextInt();
            double k = sc.nextInt();

            System.out.println((Math.ceil(k/n)) - 1);
        }

        sc.close();
    }
}
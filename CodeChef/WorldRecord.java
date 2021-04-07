import java.util.Scanner;

public class WorldRecord{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int noOfTestCases = sc.nextInt();

        int loopVar;

        for (loopVar=0; loopVar < noOfTestCases; loopVar++)
        {
            float k1 = sc.nextFloat();
            float k2 = sc.nextFloat();
            float k3 = sc.nextFloat();
            float maxSpeed = sc.nextFloat();

            double runTime =Math.round((100/(k1 * k2 * k3 * maxSpeed))*100.0) / 100.0 ;

            String isWorldRecord = (runTime < 9.58) ? "YES": "NO" ;

            System.out.println(isWorldRecord);
        }

        sc.close();
        
    }
}
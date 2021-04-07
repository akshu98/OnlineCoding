import java.util.Scanner;

public class Sock{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sock1 = sc.nextInt();
        int sock2 = sc.nextInt();
        int sock3 = sc.nextInt();

        sc.close();

        String isSameColourSock = (sock1==sock2) ? "YES": ((sock2==sock3) ? "YES" : ((sock1==sock3)? "YES" : "NO"));

        System.out.println(isSameColourSock);
    }
}
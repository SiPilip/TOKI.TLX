import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Deklarasi
        double a,b;

        //Program
        a = scan.nextDouble();
        b = scan.nextDouble();

        double hasilluas = (a*b)/2;

        System.out.printf("%.2f", hasilluas);


    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if (n >= 0 && n<=9){
            System.out.println("satuan");
        }
        if (n >=10 && n<=99){
            System.out.println("puluhan");
        }
        if (n >= 100 && n<=999){
            System.out.println("ratusan");
        }
        if (n >=1000 && n<=9999){
            System.out.println("ribuan");
        }
        if (n >= 10000 && n<=99999){
            System.out.println("puluhribuan");
        }
    }
}

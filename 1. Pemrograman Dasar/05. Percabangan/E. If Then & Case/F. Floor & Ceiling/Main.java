import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();

        System.out.println((int)Math.floor(n));
        System.out.println((int)Math.ceil(n));

    }
}

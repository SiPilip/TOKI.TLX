import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,k,i;

        /*
        DEKSRIPSI POLA
        n = 10
        k = 3
        OUT: 1 2 * 4 5 * 7 8 * 10
        Kesimpulan: pada saat bilangan kelipatan 3, output akan mengeluarkan bintang
        lalu akan melanjutkan perulangan sampai angka ke-n
         */

        n = sc.nextInt();
        k = sc.nextInt();

        for (i=1; i <= n;i++){
            if (i % k == 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }



    }
}

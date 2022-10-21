import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,j;

        boolean cek;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            cek = true; //Penginisialisasian variabel cek terlebih dahulu
            int angka = sc.nextInt();
            byte hitungfaktor = 0;

            if (angka == 0 | angka == 1) {
                cek = false;
            }

            for (j = 1; j <= angka; j++) { //Dengan inisiasi j = 2, akan melakukan perulangan selama j*j akan lebih kurang sama dengan dari angka
                if (angka % j == 0) {
                    hitungfaktor += 1;
                }
                if (hitungfaktor > 4){ //Jika jumlah faktor sudah melebihi 4 maka perulangan akan dihentikan
                    break;
                }
            }

            if (hitungfaktor <= 4){ //jika hasil faktor kurang dari sama dengan 4
                cek = true;
            }

            if (hitungfaktor > 4){ //jika hasil faktor lebih dari 4
                cek = false;
            }

            if (cek) { //apabila angka tersebut prima
                System.out.println("YA");
            } else { //apabila angka tersebut tidak prima
                System.out.println("BUKAN");
            }

        }
    }
}

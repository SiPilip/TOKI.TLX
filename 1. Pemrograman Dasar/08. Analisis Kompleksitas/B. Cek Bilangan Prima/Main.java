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

                if (angka == 0 | angka == 1) { //Pengecualian angka untuk 1 dan 0 akan digolongkan menjadi bilangan bukan prima
                    cek = false;
                }

                else {
                    for (j = 2; j*j <= angka; j++) { //Dengan inisiasi j = 2, akan melakukan perulangan selama j*j akan lebih kurang sama dengan dari angka
                        if (angka % j == 0) {
                            cek = false;
                            break;
                        }
                    }
                }

                if (cek) { //apabila angka tersebut prima
                        System.out.println("YA");
                        cek = true;
                } else { //apabila angka tersebut tidak prima
                    System.out.println("BUKAN");
                    cek = true;

                }

            }
        }
    }

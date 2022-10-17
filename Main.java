import java.util.Scanner;

/*
cara menampilkan bilangan genap dan ganjil
a%2=0 maka genap
kecuali angka nya itu adalah ganjil
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double alas,tinggi,panjang,lebar;
       int menu;

        System.out.println("ini adalah program menghitung luas bangun datar");
        System.out.println("memilih menu");
        System.out.println("masukkan pilihan menu");
        menu = sc.nextInt();
        // pemilihan
        switch (menu) {
            case 1:
                System.out.println("menghitung luas segitiga");
                System.out.println("masukkan alas");
                alas = sc.nextDouble();

                System.out.println("masukkan tinggi");
                tinggi = sc.nextDouble();

                hasil = ((0.5 * alas * tinggi);
                System.out.println("hasil segi tiga adalah" + hasil);
                break;

            System.out.println("masukka panjang");
            panjang = sc.nextInt();

            System.out.println("masukkan lebar");
            lebar = sc.nextInt();

        }
    }
}
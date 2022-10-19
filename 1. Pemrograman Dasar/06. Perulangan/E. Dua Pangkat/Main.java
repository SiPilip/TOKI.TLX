import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,k,angka;

        n = sc.nextInt();
      
      /*
      DESKRIPSI POLA
      2 x 2 x 2 x 2 x 2 x 2 x ...
      maka output akan bernilai ya jika,
      n = 2 (2)
      n = 4 (2x2)
      n = 8 (2x4)
      n = 16 (2x8)
      dst..
      */

        while (n > 1) { //kondisi digunakan karena output yang dibutuhkan 
            if (n % 2 == 0){ //while akan terus mengulang jika n dimodulus oleh 2 bernilai 0 (tidak bersisa)
                n = n / 2; //variabel n akan dibagi dengan 2, dan akan disimpan kedalam variabel n. (akan terus mengulang)
                continue;
            } else {
                System.out.println("bukan"); 
              /*
              Bagian n = n/2 akan terus mengurangi nilai, dan akan bernilai bukan jika ada hasilnya yang "bersisa" jika dimodulus 2. 
              Karena semua hasil dari perpangkatan 2, jika dibagi dengan 2 itu sendiri (sampai hasil baginya 1) semua hasil pembagiannya akan terus tak bersisa.
              */
                System.exit(0); //keluar dari program
            }
        }
        System.out.println("ya"); 
      /*
      Sebaliknya akan bernilai ya, jika seluruh hasil pembagiannya (dibagi 2, sampai hasilnya 1), jika dimodulus dengan 2 akan tak bersisa.
      */

    }
}

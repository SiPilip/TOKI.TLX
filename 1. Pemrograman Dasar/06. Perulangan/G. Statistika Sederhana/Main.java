import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,angka,maks,min,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        maks = 0;
        min = 0;

        for ( i = 1; i<=n ;i++) {
            angka = sc.nextInt();
            if (i == 1){
                maks = angka;
                min = angka;
            }
            /*
            Seleksi diatas berguna jika inputan hanya 1 angka
            jika inputan hanya 1, maka nilai maks atau min salah satunya akan bernilai 0, yang mana
            keluaran tersebut tidak benar adanya.
            jika inputan hanya 1 maka nilai maks dan min adalah angka pertama yang diinput oleh user.

            jadi seleksi tersebut hanya berlaku pada saat input pertama.
             */

            if( angka >= maks ){ //Jika angka lebih dari simpanan maksimum
                maks = angka;
            }
            if( angka <= min ){ //Jika kurang dari simpanan minimum
                min = angka;
            }
        }
        System.out.println(maks + " " + min);

    }
}

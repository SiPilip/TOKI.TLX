import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int jumlah = 0;

        while (sc.hasNextInt()){ //untuk mendeteksi EOF
            int angka = sc.nextInt();
            jumlah += angka; //menambahkan setiap inputan angka kedalam variabel jumlah
            if (!sc.hasNextInt()){ //untuk mendeteksi EOF | ! untuk membalikkan kondisi
                System.out.println(jumlah);
            }
        }

    }
}

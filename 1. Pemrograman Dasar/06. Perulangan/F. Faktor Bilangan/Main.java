import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int i = n; //Untuk menyimpan nilai n ke dalam variabel i. Karena output akan berisi nilai yang menurun.


        while (i >= 1) {
            if (n % i == 0) { //akan menjalankan ekspresi jika n dimodulus dengan i tak bersisa.
                System.out.println(i+ " ");
                i--;
            } else {
                i--;
                continue;
            }
        }




    }
}

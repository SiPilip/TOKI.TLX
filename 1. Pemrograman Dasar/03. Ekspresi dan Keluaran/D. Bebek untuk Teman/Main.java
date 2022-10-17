import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Deklarasi
        int N,M;

        //Input data 1
        N = scan.nextInt();
        M = scan.nextInt();

        //Deklarasi 1
        int hasilbagi = N/M;
        int hasilmodulus = N%M;

        //Keluaran 1
        System.out.println("masing-masing " + hasilbagi);
        System.out.println("bersisa "+ hasilmodulus);

    }
}

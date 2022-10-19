import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bebek,jumbebek,totalbebek;
        jumbebek = 0;

        totalbebek = sc.nextInt();

        for(int i=1;i <= totalbebek;i++){
            bebek = sc.nextInt();
            jumbebek += bebek;

        }
        System.out.println(jumbebek);
    }
}

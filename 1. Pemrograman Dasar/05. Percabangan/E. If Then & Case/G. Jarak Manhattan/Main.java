import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x1,x2,y1,y2,x1x2,y1y2,jarak;

        Scanner sc = new Scanner(System.in);

        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        x1x2 = Math.abs(x1-x2);
        y1y2 = Math.abs(y1-y2);

        jarak = x1x2 + y1y2;

        System.out.println(jarak);

    }
}

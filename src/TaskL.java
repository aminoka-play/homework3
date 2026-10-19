import java.util.Scanner;
public class TaskL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int c = 0;
        int i = 1;
        while (x > 0) {
            int d = x % 10;
            c += d * i;
            i *= 2;
            x /= 10;
        }
        System.out.println(c);
    }
}

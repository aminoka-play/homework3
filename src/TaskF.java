import java.util.Scanner;
public class TaskF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int c = 0;
        while (x > 0) {
            c = c * 10 + x % 10;
            x /= 10;
        }
        System.out.println(c);
    }
}
import java.util.Scanner;
public class TaskD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        int d = s.nextInt();
        int c = 0;
        while (x > 0) {
            if (x % 10 == d) {
                c++;
            }
            x /= 10;
        }
        System.out.println(c);
    }
}

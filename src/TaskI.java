import java.util.Scanner;
public class TaskI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int c = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                c++;
                if (i != x / i) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}

import java.util.Scanner;
public class TaskN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            if (x == 0) {
                a++;
            } else if (x > 0) {
                b++;
            } else {
                c++;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}

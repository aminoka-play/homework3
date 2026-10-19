import java.util.Scanner;
public class TaskO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            if (x == 0) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
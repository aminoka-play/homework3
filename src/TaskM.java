import java.util.Scanner;
public class TaskM {
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
        System.out.println(c);
    }
}
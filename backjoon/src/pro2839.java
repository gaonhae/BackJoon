import java.util.Scanner;

public class pro2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 9999999;
        int b = 9999999;
        boolean flag = false;

        for (int k = 0; k < n / 3 + 1; k++) {
            for (int i = 0; i < n / 5 + 1; i++) {
                if (3 * k + 5 * i == n) {
                    flag = true;
                    if (k + i < a + b) {
                        a = k;
                        b = i;
                    }
                }

            }
        }

        if (flag == false) {
            System.out.println(-1);
        } else {
            System.out.println(a + b);
        }
    }

}

import java.util.Scanner;

public class pro1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[4472];
        func1193.getList(list);
        int num = 0;

        num = sc.nextInt();
        func1193.func(list, num);

    }
}


class func1193 {
    public static void getList(int[] list) {
        int num = 0;

        for (int a = 1; a <= list.length; a++) {
            num += a;
            list[a-1] = num;
        }

    }

    public static void func(int[] list, int num) {

        int n, k = 0;

        for (int a = 0; a < list.length; a++) {
            if (num == 1) {
                System.out.println("1/1");
                break;
            } else if (num <= list[a]) {
                n = a + 1;
                k = num - (int) list[a - 1];
                if (n % 2 == 0) {
                    System.out.printf("%d/%d", k, n - k + 1);
                } else {
                    System.out.printf("%d/%d", n - k + 1, k);
                }
                break;
            }

        }
    }
}
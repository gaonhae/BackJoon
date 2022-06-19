import java.util.Scanner;

public class pro2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        int a,b,sum = 0;

        for(int o = 0 ; o < count ; o++){
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());
            //a==3층, b==4호인 경우
//            for(int p = 0 ; p < a ; p++){
                sum = 4 + 6*a + 4*(a-1) + 5*(a-2) + 6*(a-3);
            System.out.println(sum);
//            }
        }
    }
}

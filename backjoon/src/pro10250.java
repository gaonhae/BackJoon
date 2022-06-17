import java.util.Scanner;

public class pro10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = 0;
        int w = 0;
        int n = 0;
        int t = Integer.parseInt(sc.nextLine());

        for(int a = 0 ; a < t ; a++){
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();
            if(n%h != 0){
                System.out.printf("%d%02d\n",(n%h),(((int)(n/h))+1));
            }
            else{
                System.out.printf("%d%02d\n",(h),(((int)(n/h))));
            }
        }
    }
}

import java.util.Scanner;

public class pro1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        for(int i = 0 ; i < 100000 ; i++){
            if(a == 1){
                System.out.println(1);
                break;
            }
            if( func1712.func(i)+2 <= a && func1712.func(i+1)+1 >= a){
                System.out.println(i+2);
                break;
            }
        }
    }
}

class func1712 {
    public static int func(int i) {
        int num = 0;
        for (int a = 0; a <= i; a++) {
            num += 6 * a;
        }
        return num;
    }
}

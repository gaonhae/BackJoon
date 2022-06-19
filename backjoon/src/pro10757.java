import java.util.Scanner;

public class pro10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String str = "";
        int[] arr = new int[100000];

        StringBuffer asb = new StringBuffer(a).reverse();
        a = asb.toString();
        StringBuffer bsb = new StringBuffer(b).reverse();
        b = bsb.toString();

        String longer = a.length() >= b.length() ? a : b;


        for (int i = 0; i < a.length(); i++) {
            arr[i] += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        for (int i = 0; i < b.length(); i++) {
            arr[i] += Integer.parseInt(String.valueOf(b.charAt(i)));
        }

        for (int i = 0; i < longer.length(); i++) {
            if (arr[i] >= 10) {
                arr[i + 1]++;
                arr[i] -= 10;
            }

        }
        if(arr[longer.length()] > 0){
            for (int i = longer.length(); i >= 0; i--) {
                str += arr[i];
            }

        }
        else {

            for (int i = longer.length()-1; i >= 0; i--) {
                str += arr[i];
            }
        }

        System.out.println(str);


    }
}
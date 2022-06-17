import java.util.Arrays;
import java.util.Scanner;

public class pro1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int count = 0;
        String word = "";

        for(int i = 0 ; i < a ; i++ ){
            word = sc.nextLine();
            if(Func.groupWord(word)){
                count++;
            }
        }

        System.out.println(count);

    }
}

class Func{
    public static boolean groupWord(String word){

        int count = 0;
        String sentence = "";

        for(int a = 0 ; a < word.length() ; a++){
                if(a != word.length()-1 && word.charAt(a) != word.charAt(a+1)){
                    if(sentence.contains(Character.toString(word.charAt(a)))){
                        return false;
                    }
                    else{
                        sentence += Character.toString(word.charAt(a));
                    }
                }
                else if(a == word.length()-1){
                    if(sentence.contains(Character.toString(word.charAt(a)))){
                        return false;
                    }
                    else{
                        sentence += Character.toString(word.charAt(a));
                    }
                }
        }
        return true;
    }
}

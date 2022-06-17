import java.io.*;

public class pro2869 {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = bf.readLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int v = Integer.parseInt(nums[2]);
        if((v-a)%(a-b) != 0){
            bw.write(String.valueOf((v-a)/(a-b)+2));
        }
        else{
            bw.write(String.valueOf((v-a)/(a-b)+1));
        }
        bw.flush();
        bw.close();
    }
}

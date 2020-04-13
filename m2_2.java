import java.util.*;

public class m2_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tall = scn.nextInt();
        int n = scn.nextInt();
        float weight;
        if(n == 1){
            weight = (float) ((tall - 80) * 0.7);
        }else{
            weight = (float)((tall - 70) * 0.6);
        }
        System.out.printf("%.1f", weight);
    }
}
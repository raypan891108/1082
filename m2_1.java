import java.util.Scanner;

public class m2_1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String n = scn.next();
        String [] array = n.split("e");
        if(array.length == 1){
            System.out.println(n);
        }else{
            System.out.println(Double.parseDouble(array[0]) * Math.pow(10,Integer.parseInt(array[1])));
        }
    }
}
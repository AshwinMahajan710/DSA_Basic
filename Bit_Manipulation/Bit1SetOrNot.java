package Bit_Manipulation;

public class Bit1SetOrNot {
    public static void main(String[] args) {
        int no = 15;
        int bitIndex = 2;
        boolean ans = (no&(1<<bitIndex))!=0; // maintain proper circular brackets
        System.out.println(ans);
    }
}

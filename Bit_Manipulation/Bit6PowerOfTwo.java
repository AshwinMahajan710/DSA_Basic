package Bit_Manipulation;

public class Bit6PowerOfTwo {
    public static void main(String[] args) {
        int no = 8;
        if ((no&(no-1))==0) {
            System.out.println("It is power of 2...");
        }
        else{
            System.out.println("It is not power of 2....");
        }
    }
}

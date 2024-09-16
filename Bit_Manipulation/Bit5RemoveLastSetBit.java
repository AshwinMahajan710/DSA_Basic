package Bit_Manipulation;

public class Bit5RemoveLastSetBit {
    public static void main(String[] args) {

        // * * * * * * * * * * Optimal Approach  * * * * * * * * * * * 
        int no = 10;
        System.out.println("Before unsetting the bit :- "+Integer.toBinaryString(no));
        System.out.println("After unsetting the bit :- "+Integer.toBinaryString((no&(no-1))));

        // * * * * * * * * * * * Brute force approach * * * * * *  * * * * 
        // int no = 14;
        // System.out.println("Before unsetting the bit :- " + Integer.toBinaryString(no));
        // for (int i = 0; i < 31; i++) {
        //     if (((no >> i) & 1) == 1) {
        //         System.out.println("After unsetting the bit :- " + Integer.toBinaryString((no & ~(1 << i))));
        //         return;
        //     }
        // }
    }
}

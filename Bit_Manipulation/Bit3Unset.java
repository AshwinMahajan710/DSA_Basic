package Bit_Manipulation;

public class Bit3Unset {
    public static void main(String[] args) {
        int no = 23;
        int setIndex = 2;
        System.out.println("Before unsetting the bit :- "+Integer.toBinaryString(no));
        System.out.println("After setting the index :- "+Integer.toBinaryString(no&~(1<<setIndex)));
    }
}

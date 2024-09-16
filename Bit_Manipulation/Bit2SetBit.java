package Bit_Manipulation;

public class Bit2SetBit {
    public static void main(String[] args) {
        int no = 56;
        int setIndex = 2;
        System.out.println("Before setting index :-" +Integer.toBinaryString(no));
        System.out.println("After setting index :- "+Integer.toBinaryString((no|(1<<setIndex))));
    }
}

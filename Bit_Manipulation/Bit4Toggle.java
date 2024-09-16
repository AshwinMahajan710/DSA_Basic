package Bit_Manipulation;

public class Bit4Toggle {
    public static void main(String[] args) {
        int no = 56;
        int setIndex = 3;
        System.out.println("Before Toggling index :-" +Integer.toBinaryString(no));
        System.out.println("After Toggling index :- "+Integer.toBinaryString((no^(1<<setIndex))));
    }
}

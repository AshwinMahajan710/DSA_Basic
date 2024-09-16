package basic_codes;
public class Swap_by_Bit {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}

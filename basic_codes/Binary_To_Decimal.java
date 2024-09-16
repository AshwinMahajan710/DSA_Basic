package basic_codes;
public class Binary_To_Decimal{
    public static void main(String[] args) {
        int bin_no = 1111;
        int power = 1;
        int ans = 0;
        while (bin_no>0) {
            ans += bin_no%10 * power;
            bin_no = bin_no/10;
            power = power*2;
        }
        System.out.println(ans);
    }
}

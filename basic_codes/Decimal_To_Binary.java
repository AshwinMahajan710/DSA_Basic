package basic_codes;
public class Decimal_To_Binary {
    // <---------- Recurrsive Approach --------->
    public static void cal(int N, StringBuilder sb){
        if(N==0) return;
        cal(N/2,sb);
        sb.append(N%2);    
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        cal(10, sb);
        System.out.println(sb.toString());
    }

    // <---------- Without extra space optimal approach ---------->
    // public static void main(String[] args) {
    //     int b=0,i=1;
    //     int n = 10;
    //     while(n!=0)
    //     {
    //         int d=n%2;
    //         b+=d*i;
    //         n/=2;
    //         i*=10;
    //     }
    //     System.out.println(b);    
    // }

    // <------- Approach using normal while loop ------->
    // public static void main(String[] args) {
    //     StringBuilder sb = new StringBuilder();
    //     int N = 2;
    //     while (N!=0) {
    //         int rem = N%2;
    //         N = N/2;
    //         sb.insert(0,rem);
    //     }
    //     System.out.println(sb.toString());

    // }
}

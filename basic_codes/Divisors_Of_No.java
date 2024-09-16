package basic_codes;
public class Divisors_Of_No {

    // <-------------------- Square root of N Approach --------------------->
    public static void main(String[] args) {
        int no = 10;
        int sqrt = (int)(Math.sqrt(no));
        for(int i=1;i<=sqrt;i++){
            if(no%i==0){
                System.out.println(i);
                if(no/i != i){
                    System.out.println(no/i);
                }
            }
        }
    }

    // <------------------- O(N) Appraoch ------------------->
    // public static void main(String[] args) {
    //     int no = 13;
    //     for(int i=1;i<=13;i++){
    //         if(no%i==0){
    //             System.out.println(i);
    //         }
    //     }
    // }
}

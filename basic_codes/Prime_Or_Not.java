package basic_codes;
public class Prime_Or_Not {

    // <------------------- O(sqrt(N)) approach -------------------->
    // Easy concept for calculating two factors at a time
    // notice patterns after taking square root of no.
    public static void main(String[] args) {
        int no = 13;
        int count=0;
        int sqrt = (int)(Math.sqrt(no));
        for(int i=1;i<=sqrt;i++){
            if(no%i==0){
                count++;
                if(no%i != i){
                    count++;
                }
            }
            if(count>2){
                break;
            }
        }
        if(count>2){
            System.out.println("This is not the prime no.....");
        }    
        else{
            System.out.println("This is prime no.....");
        }
    }

    // <-------------------- This is the O(N) tc approach -------------------->
    // public static void main(String[] args) {
    //     int n = 13;
    //     int count = 0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i == 0){
    //             count++;
    //         }
    //         if(count>2){
    //             break;
    //         }
    //     }
    //     if(count>2){
    //         System.out.println("This is not a prime no ......");
    //     }
    //     else{
    //         System.out.println("This is the prime no.....");
    //     }
    // }   
}

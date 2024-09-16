package Bit_Manipulation;

public class Bit7NoOfSetBits {
    // * * * * * * * * * *  Brute force * * * * * * * * * *
    // Consider the implementation as it is tested against each and every edge case
    public static void main(String[] args) {
            int no = Integer.MIN_VALUE;
            int counter = 0;
            System.out.println("The no in binary :- "+Integer.toBinaryString(no));
            for(int i=0;i<31;i++){
                if((no&(1<<i))!=0){
                    counter++;
                }
            }
            System.out.println("Total no of set bits are :- "+counter);
    }

    // * * * * * * * * * *  Optimal Approach * * * * * * * * * *
    // public static void main(String[] args) {
    //     int no = 40;
    //     int counter = 0;
    //     System.out.println("The no in binary :- "+Integer.toBinaryString(no));
    //     while (no!=0) {
    //         no = no&(no-1);
    //         counter++;
    //     }
    // System.out.println("Total no of set bits in no are :- "+counter);

}   


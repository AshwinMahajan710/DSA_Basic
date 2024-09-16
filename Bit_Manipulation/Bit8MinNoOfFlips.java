package Bit_Manipulation;

public class Bit8MinNoOfFlips {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        System.out.println("The first no is :- "+Integer.toBinaryString(no1));
        System.out.println("The second no is :- "+Integer.toBinaryString(no2));
        int xorNo = no1^no2;
        int counter = 0;
        while(xorNo!=0){
            xorNo = xorNo&(xorNo-1);
            counter++;
        }
        System.out.println("Given no of flips required to change "+no1+" to "+no2+" :- "+counter);
    }
}

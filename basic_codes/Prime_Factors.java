package basic_codes;

import java.util.ArrayList;

public class Prime_Factors {
    public static boolean isPrime(int N) {
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (N / i != i) { 
                    count++;
                }
            }
            if (count > 2) {
                break;
            }
        }
        return count == 2; 
    }

    public static void main(String[] args) {
        int no = 89;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= no; i++) {
            if (no % i == 0) {
                if (isPrime(i)) {
                    list.add(i);
                }
                if (i != no / i && isPrime(no / i)) {
                    list.add(no / i);
                }
            }
        }
        for (int ele : list) {
            System.out.println(ele);
        }
    }
}

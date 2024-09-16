package Bit_Manipulation;

import java.util.ArrayList;

public class Bit9Subsets {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        int subsets = 1<<arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int num=0;num<subsets;num++){
            ArrayList<Integer> subList = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if ((num&(1<<i))!=0) {
                    subList.add(arr[i]);
                }
            }
            ans.add(subList);
        }
        for(ArrayList<Integer> list : ans){
            System.out.print("new list no are ");
            for(int no: list){
                System.out.print(" "+no);
            }
            System.out.println();
        }
    }
}

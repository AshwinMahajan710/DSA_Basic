package basic_codes;

import java.util.Arrays;

public class Binary_Search {
    public static int binary(int []arr,int start,int end,int target) {
        if(start>end){
            return -1;
        }
        int mid = start+ (end-start)/2;
        int ans = 0;
        if(arr[mid]<target){
            ans = binary(arr, mid+1, end, target);
        }
        else if (arr[mid]>target) {
            ans = binary(arr, 0, mid-1, target);
        }
        else if(arr[mid]==target){
            ans = mid;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,23,45,67,22,9,34,567,21,46,7,424,67,89,54};
        Arrays.sort(arr);
        // for (int i : arr) {
        //     System.out.print(" "+i);
        // }
        // System.out.println(arr);// will print address btw
        System.out.println("Index of the ans :- "+binary(arr, 0, arr.length-1, 67));
    }
}


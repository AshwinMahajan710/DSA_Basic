public class Bubble_Sort {
    public static void main(String [] args){
        int [] arr = {7,8,3,2,1};
        System.out.print("The unsorted array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        // bubbleSort(arr,arr.length);
        // selectionSort(arr,arr.length);
        insertionSort(arr, arr.length);
        System.out.print("The Sorted array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    /*public static void bubbleSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int no = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = no;
                }
            }
        }
    }*/

    /*public static void selectionSort(int arr[],int n){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            int no = arr[min];
            arr[min] = arr[i];
            arr[i] = no;
        }
    }*/

    public static void insertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
    }

}

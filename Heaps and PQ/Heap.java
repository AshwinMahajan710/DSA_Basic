public class Heap {
    int heapSize;
    int heapArr[];
    int capacity;
    Heap(int[] arr){
        heapArr = arr;
        heapSize = arr.length;
        capacity = arr.length;
    }

    public void swap(int i,int j){
        int temp = heapArr[i];
        heapArr[i] = heapArr[j];
        heapArr[j] = temp;
    }

    public void heapify(int index){

        // --> Set largest index value as current
        // --> Check the largest among two childs
        // --> Call swap between index and the largest value 
        // --> Call the heapify opeartion recurssively upto head on the largest index

        int largest = index;
        int child1 = index*2+1;
        int child2 = index*2+2;
        if(child1<heapSize && heapArr[child1]>heapArr[largest]){
            largest = child1;
        }
        if(child2<heapSize && heapArr[child2]>heapArr[largest]){
            largest = child2;
        } 
        if(largest!=index){
            swap(index, largest);
            heapify(largest);
        }
    }

    public int extractMax(){
        if(heapSize==0){
            System.out.println("The Heap is currently empty...");
            return -1;
        }
        int max = heapArr[0];
        heapArr[0] = heapArr[heapSize-1];
        heapSize-=1;
        heapify(0);
        return max;
    }

    public void buildTree(){
        // --> leaf Nodes are from N/2 to N-1
        // --> Non leaf Nodes are from 0 to N/2-1
        for(int index = heapSize/2 - 1 ; index>=0 ; index--){
            heapify(index);
        }
        System.out.println();
    }

    public void printTree(){
        for (int i = 0; i < heapSize; i++) {
            System.out.println("The element "+i+" is --> " + heapArr[i] + "\n");
        }
        System.out.println();
    }

    public void increaseKey(int index, int val){
        if(index<0 || index>=heapSize || heapArr[index]>= val){
            System.out.println("Wrong Operation..");
            return;
        }  
        heapArr[index] =  val;
        while(index>0 && heapArr[index]>heapArr[(int)(Math.ceil(index/2.0)-1)]){
            swap(index,(int)(Math.ceil(index/2.0)-1));
            index = (int)(Math.ceil(index/2.0)-1); 
        }
    }

    public void increaseCapacity(){
        capacity = capacity*2;
        int[] newHeap = new int[capacity];
        for(int i=0;i<heapSize;i++){
             newHeap[i] = heapArr[i];
        }
        heapArr = newHeap;

    }
    public void heapSort(){
        int size = heapSize;
        for(int i=0;i<size;i++){
            System.out.println("The element "+ i +"-- > " + extractMax());
        }
    }
    public void pushKey(int val){
        if(heapSize+1>=capacity){
            increaseCapacity();
        }
        heapSize += 1;
        heapArr[heapSize-1] = val;
        int index = heapSize-1;
        while(index>0 && heapArr[index]>heapArr[(int)(Math.ceil(index/2.0)-1)]){
            swap(index,(int)(Math.ceil(index/2.0)-1));
            index = (int)(Math.ceil(index/2.0)-1); 
        }

    }
    public void decreaseKey(int index, int val){
        if(index<0 || index>=heapSize || heapArr[index]>= val){
            System.out.println("Wrong Operation..");
            return;
        } 
        heapArr[index] =  val;
        heapify(index);
    }
    public static void main(String[] args) {
        int [] arr = {10,5,67,23,68,89};
        Heap my = new Heap(arr);
        my.buildTree();

        // Print the tree after building it
        // my.printTree();

        // Extracting the maximum Element
        // int max = my.extractMax();
        // System.out.println("The Max Element is --> " + max);
        // my.printTree();

        // The increase key function
        // my.printTree();
        // my.increaseKey(4, 90);
        // my.printTree();

        // The decrease key function
        // my.printTree();
        // my.decreaseKey(4, 9);
        // my.printTree();

        // The addition of a key
        // my.printTree();
        // my.pushKey(101);
        // my.printTree();

        // heap sort successful
        my.heapSort();
    }
}

public class MinHeap {
    int capacity;
    int heapSize;
    int heapArr[];
    MinHeap(int[] arr){
        this.heapArr = arr;
        this.capacity = this.heapArr.length;
        this.heapSize = this.capacity; 
    }
    public void swap(int i,int j){
        int temp = heapArr[i];
        heapArr[i] = heapArr[j];
        heapArr[j] = temp;
    }
    public void heapify(int target){
        int smallest = target;
        int child1 = target*2 + 1;
        int child2 = target*2 + 2;
        if(child1<heapSize && heapArr[child1]<heapArr[smallest]){
            smallest = child1;
        }
        if(child2<heapSize && heapArr[child2]<heapArr[smallest]){
            smallest = child2;
        }
        if(smallest == target) {
            return;
        }
        swap(smallest,target);
        heapify(smallest);
    }
    public void buildTree(){
        for(int i=heapArr.length/2-1 ; i>=0 ; i--){
            heapify(i);
        }
    }
    public void increaseKey(int index,int val){
        if(index>=heapSize || val<=heapArr[index]){
            System.out.println("Wrong opeartion");
            return;
        }
        heapArr[index] = val;
        while(index>0 && heapArr[index]<heapArr[(int)(Math.ceil(index/2.0)-1)]){
            swap(index,(int)(Math.ceil(index/2.0)-1));
            index = (int)(Math.ceil(index/2.0)-1); 
        }
    }
    public void decreaseKey(int index,int val){
        if(index>=heapSize || val>=heapArr[index]){
            System.out.println("Wrong opeartion");
            return;
        }
        heapArr[index] = val;
        heapify(index);
    }
    public void extractTop(){
        System.out.println("The extracted element is --> "+ heapArr[0]);
        swap(0, heapSize-1);
        heapSize--;
        heapify(0);
        System.out.println("The resulted heap array :- ");
        printTree();
    }
    public void printTree(){
        for(int i=0;i<heapSize;i++){
            System.out.println("Element "+i+"--> "+heapArr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,34,67,12,45,89,07};
        MinHeap my = new MinHeap(arr);
        my.buildTree(); // Build the MinHeap tree
        // my.printTree();

        // Common with the extract top in 
        // Extract the top element
        //my.extractTop();

        // Increase Key Logic
        // my.printTree();
        // my.increaseKey(4, 54);
        // my.printTree();

        // Decrease key logic
        // my.printTree();
        // my.decreaseKey(3, 12);
        // my.printTree();
        System.out.println(my.toString());
    }
}   

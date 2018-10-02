package heap;

public class Heapify {

    private int parentIndex(int pos)
    {
        return (pos-1) / 2;
    }

    private int left(int pos)
    {
        return (2 * pos + 1);
    }

    private int right(int pos)
    {
        return (2 * pos) + 2;
    }

    private void swap(int[] arr, int fpos, int spos)
    {
        int tmp;
        tmp = arr[fpos];
        arr[fpos] = arr[spos];
        arr[spos] = tmp;
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

   private int  extractmax(int arr[] , int n){

        if(arr.length<1) {
            System.out.println("error");
            return  -1;
        }
         int max = arr[0];
        arr[0] = arr[arr.length -1];
       heapify(arr, arr.length, 0);
       return  max;
   }
    private void  increaseKey(int arr[] , int i, int key) {

        if(key < arr[i]){
         // error
        }
        arr[i] = key;

        while (i>1 && arr[parentIndex(i)] < arr[i]) {

            swap(arr,parentIndex(i),i);
        }

    }

        private  void buildHeap(int[] arr){
        int size = arr.length;
        // onlr for non leaf nodes you have to run
            for (int i = size / 2 - 1; i >= 0; i--)
                heapify(arr, size, i);
    }

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7,16,17,1,56,98,3,2 ,55,44};
        int n = arr.length;

        Heapify ob = new Heapify();
        //ob.sort(arr);
        ob.buildHeap(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }


    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");


        System.out.println();
    }

}

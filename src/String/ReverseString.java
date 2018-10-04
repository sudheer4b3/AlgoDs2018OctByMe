package String;

public class ReverseString {

   static  void rvereseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){

           int temp = arr[end];
           arr[end] = arr[start];
           arr[start]= temp;
           start ++;
           end --;
        }

    }
    static  void reverseRecursive(int[] arr, int start, int end){


       if(start >= end) {
           return;
       }
       int temp = arr[end];
        arr[end] = arr[start];
        arr[start]= temp;
        reverseRecursive(arr,start+1,end-1);

    }


    // Driver code
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);

       // rvereseArray(arr);
        reverseRecursive(arr, 0 ,arr.length-1);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);

    }


    /* Utility that prints out an
  array on a line */
    static void printArray(int arr[],
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}

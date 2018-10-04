package String;

public class ReverseWordsInPlace {


    public static String reverseWords(String s) {
        if (s.length() < 1) return s; // empty string
        int startIdx = 0;
        char[] str = s.toCharArray();
        // reverse whole string
        reverse(str, 0, str.length - 1);
        // reverse word one by one
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                if (startIdx != 0) str[startIdx++] = ' ';
                int j = i;
                while (j < str.length && str[j] != ' ')
                    str[startIdx++] = str[j++];
                reverse(str, startIdx - (j - i), startIdx - 1); // startIdx - 1, NOT startIdx;
                // C++ std::reverse : Reverses the order of the elements in the range [first, last)
                i = j;
            }
        }
        return new String(str, 0, startIdx);
    }

    private static void reverse(char[] str, int begin, int end) {
        for (; begin < end; begin++, end--) {
            char tmp = str[begin];
            str[begin] = str[end];
            str[end] = tmp;
        }
        System.out.println("string :"+printString(str,str.length));
    }

    // Driver code
    public static void main(String args[]) {

        //int arr[] = {1, 2, 3, 4, 5, 6};
      //  printArray(arr, 6);

        String string = "I am a mastik";
        System.out.println("Actual String : "+string);
        String reversedString  = reverseWords(string);
        System.out.println("Reversed String  is : " +reversedString);


    }
    static String printString(char arr[],
                           int size)

    {
        String str= "";
        for (int i = 0; i < size; i++)
         str=str+arr[i];
        return  str;
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

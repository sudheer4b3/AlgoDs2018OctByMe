package String;

public class ReverseWordsInplaceFinal {

  //  https://www.geeksforgeeks.org/split-string-substrings-using-delimiter/
    public static String reverseWords(String s) {
        char[] result = s.toCharArray();
        reverseWordsHelper(result);
        return String.valueOf(result);
    }

    public static void reverseWordsHelper(char[] s) {
        int i =0; int j= 0;
        char[] reversed = reverse(s,i,s.length-1);

        System.out.println(reversed);

        while(j < reversed.length)
        {
            if(reversed[j] == ' ')
            {
                if(j > i)
                {
                    reverse(reversed, i, j - 1);
                    i=j;
                }

                i++;
            }

            j++;
        }
        reverse(reversed, i, j - 1);
    }



    public static char[] reverse(char[] word, int i, int j){
        while(i <= j){
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return word;
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("hello world"));
       // System.out.println(reverseWords("singing in the rain"));
        //System.out.println(reverseWords("i like this program very much"));
    }
}
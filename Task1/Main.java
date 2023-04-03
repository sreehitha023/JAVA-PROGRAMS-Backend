import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();//input
        Duplicate.duplicateprint(word);//method

        System.out.println("Recurssion output : " +Recurssion.recurssionprint(word));//printing & method calling

        Occurence.occurence(word);//method

        String word1 = sc.nextLine();//input
        String word2 = sc.nextLine();//input
        Append.appendprint(word1,word2);//method

        String string = sc.nextLine();//input
        Permutation.permutationprint(string);//method

        String string1 = sc.nextLine();//input
        LengthOfLongestSubstring.longestsubstringprint(string1);//method calling
        Collections.sort(LengthOfLongestSubstring.arrayList);//sorting thr arraylist
        System.out.println(LengthOfLongestSubstring.arrayList.get(LengthOfLongestSubstring.arrayList.size()-1));//printing the maximum length

    }
}
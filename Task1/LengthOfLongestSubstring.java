import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class LengthOfLongestSubstring
{
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void longestsubstringprint(String string1)
    {
        String[] word = string1.split("\\s+");//to split single word

        for (int j = 0; j < word.length; j++)

        {

            Set<Character> set = new HashSet<>();

            int length = 0;

            for (int i = 0; i < word[j].length(); i++)//word length to check character
            {
                char c = word[j].charAt(i);
                if (!set.contains(c)) {
                    set.add(c);
                    length++;
                }
            }
            arrayList.add(length);
        }
    }
}






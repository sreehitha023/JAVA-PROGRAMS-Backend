import java.util.ArrayList;

public class Occurence
{
    public static void occurence(String word)
    {
        int len = word.length();
        int count[] = new int[256];
        char [] chararr = word.toCharArray();

        for (int i = 0; i < len ; i++)
        {
            if(chararr[i] != ' ')
            count[(int) word.charAt(i)]++;
        }

        for (int i = 0; i < 256;i++)
        {
            if (count[i]!=0)
            {
                System.out.println("Occurence of character " +(char)i + " is " + "------> " + count[i]);
            }
        }
    }
}

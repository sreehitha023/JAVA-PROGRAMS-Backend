import java.util.ArrayList;

class Duplicate {
    public static void duplicateprint(String word)
    {
        ArrayList<Character> arrayList = new ArrayList<>();
        char[] chararray = word.toCharArray();//single character
        int length = word.length();
        for (int i = 0; i < length; i++)//first character
             {
            for (int j = i + 1; j < length; j++)//next character comparision
            {
                if(chararray[i] != ' ')
                if (chararray[i] == chararray[j] && (!(arrayList.contains(chararray[i]))))
                {
                    arrayList.add(chararray[i]);
                }
            }
        }
        System.out.println("Duplicates are:"+arrayList);
    }
}

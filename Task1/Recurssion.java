class Recurssion
{
    public static String recurssionprint(String word)
    {
        if(word.isEmpty())
        {
            return word;
        }
        else
        {
            return recurssionprint(word.substring(1))+word.substring(0,1);
        }

    }
}

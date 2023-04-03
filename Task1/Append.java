public class Append
{
    public static void appendprint(String word1,String word2)
    {
        int lengthofword1 = word1.length();
        int lengthofword2 = word2.length();

        if (lengthofword1 == lengthofword2)
            System.out.println(word1+word2);

        else{
            if (lengthofword1>lengthofword2)
            {
                int length = lengthofword1 - lengthofword2;
                System.out.println(word1.substring(length)+word2);
            }
            else if (lengthofword1<lengthofword2)
            {
               int length = lengthofword2 - lengthofword1 ;
                System.out.println("Append output : "+word1+word2.substring(length));
            }
        }
    }
}

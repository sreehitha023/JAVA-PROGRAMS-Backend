import java.util.*;

class Permutation
{
    public static void permutationprint(String string)
    {
        System.out.println("Enter the string for permutation: ");
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("");

        while (!stack.isEmpty())
        {
            String prefix = stack.pop();

            if (prefix.length() == string.length())
            {
                result.add(prefix);
            }
            else
            {
                for (int i = 0; i < string.length(); i++)
                {

                    String ch = String.valueOf(string.charAt(i));
                    if (!prefix.contains(ch))
                    {
                        stack.push(prefix + ch);

                    }
                }
            }
        }
        System.out.println(result);
    }
}

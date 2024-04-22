public class Fatorial 
{
    public static void main (String[] args)
    {
        for (int i = 1; i < 21; i++)
        {
            long n = i;

            for (int j = i - 1; j > 1; j--)
                n *= j;

            System.out.println (n);
        }
    }
}

public class NestedFor 
{
    public static void main (String [] args)
    {
        for (int n = 1; n <= 10; n++)
        {
            for (int i = 1; i <= n; i++)
                System.out.print (i * n + " ");
                
            System.out.println ();
        }
    }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class InserirNumeros
{
    public static void main (String[] args)
    {
        long start = System.currentTimeMillis();

        Collection<Integer> lista = new HashSet<>();

        for (int i = 0; i < 100000; i++)
        {
            lista.add (i);
        }

        long mid = System.currentTimeMillis();

        System.out.println ("Tempo: " + (mid - start) + " milissegundos");

        for (int i = 0; i < 100000; i++)
        {
            lista.contains (i);
        }

        long end = System.currentTimeMillis();

        System.out.println ("Tempo: " + (end - start) + " milissegundos");
    }
}
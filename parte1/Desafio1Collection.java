import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Desafio1Collection {
    public static void main (String[] args)
    {
        Comparator<Integer> comparator = new Comparator<Integer>() 
        {
            public int compare (Integer n1, Integer n2) 
            {
                return Integer.compare (n1, n2) * -1;
            }
        };

        Set<Integer> set = new TreeSet<Integer> (comparator);

        for (int i = 1; i < 1001; i++)
            set.add (i);

        for (Integer i : set)
            System.out.println (i);

        System.out.println ("\n\nFim Set\n");

        List<Integer> lista = new ArrayList<Integer> ();

        for (int i = 1; i < 1001; i++)
            lista.add (i);

        Collections.sort(lista, comparator);

        for (Integer i : lista)
            System.out.println (i);
    }
}

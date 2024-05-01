import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteListas {
    public static void main (String[] args)
    {
        List lista = new ArrayList();
        List linked = new LinkedList();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++)
        {
            lista.add (0, i);
        }

        long end = System.currentTimeMillis();
        
        System.out.println("Tempo: " + (end - start) + " milissegundos");

        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++)
        {
            linked.add (0, i);
        }

        end = System.currentTimeMillis();

        System.out.println ("Tempo: " + (end - start) + " milissegundos");
    }
}

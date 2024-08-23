package poo.provas.P1.Segundo2013;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {
    public static void main (String[] args)
    {
        Substitui.processa ("paralelismo");
        Scanner sc = new Scanner (System.in);
        String id = sc.nextLine();

        Produto produto = new Produto (id);

        List lista = Utils.getLista();

        if (Utils.existe (lista, produto))
        {
            System.out.println (lista.get (lista.indexOf (produto)));
        }

        Produto [] a = transformaListEmArray (lista);

        for (int i = 0; i < a.length; i++)
        {
            System.out.println (a[i]);
        }

        sc.close();
    }

    public static Produto [] transformaListEmArray (List k)
    {
        List<Produto> lista = new ArrayList<Produto> ();

        Iterator a = k.iterator();
        
        while (a.hasNext())
        {
            Object b = a.next ();
            if (b instanceof Produto)
                lista.add ((Produto) b);
        }

        return lista.toArray(new Produto[0]);
    }
}

package poo.provas.Primeiro2019;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        String id = sc.nextLine ();

        List lista = Utils2.getLista();

        Produto produto = new Produto (id);

        if (Utils.existe (lista, produto))
        {
            System.out.println (lista.get (lista.indexOf (produto)));
        }

        sc.close ();
    }

    public static Produto [] transformaListEmArray (List k)
    {
        ArrayList<Produto> arrList = new ArrayList<Produto> ();

        for (Object i : k)
        {
            if (i instanceof Produto)
                arrList.add ((Produto) i);
        }

        return arrList.toArray (new Produto[0]);
    }

    public static double retornaSoma (Produto [] arr)
    {
        double total = 0;

        for (Produto i : arr)
            total += i.preco;

        return total;
    }
}

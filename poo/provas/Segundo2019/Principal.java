package poo.provas.Segundo2019;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String id = sc.nextLine ();

        Biscoito biscoito = new Biscoito (id);

        List lista = Utils.getLista();

        if (Utils.existe (lista, biscoito))
        {
            System.out.println (lista.get(lista.indexOf(biscoito)));
        }

        Biscoito [] biscoitos = transformaListEmArray (lista);

        int total = 0;

        for (int i = 0; i < biscoitos.length; i++)
        {
            total += biscoitos[i].getPreco();
        }

        total /= biscoitos.length;

        sc.close ();
    }

    public static Biscoito [] transformaListEmArray (List k)
    {
        Iterator iterator = k.iterator ();

        List<Biscoito> biscoitoList = new ArrayList<Biscoito> ();

        while (iterator.hasNext ())
        {
            Object obj = iterator.next ();
            if (obj instanceof Biscoito)
            biscoitoList.add ((Biscoito) obj);
        }

        return biscoitoList.toArray(new Biscoito[0]);
    }
}

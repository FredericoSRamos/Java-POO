package poo.provas.P1.Segundo2018;

import java.util.Scanner;
import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;

import poo.provas.P1.Primeiro2019.Utils2;

public class Principal {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        List lista = Utils2.getLista();

        String id = sc.nextLine ();

        Biscoito temp = new Biscoito (id);

        if (Utils.existe (lista, temp))
        {
            System.out.println (lista.get (lista.indexOf (temp)));
        }

        sc.close ();
    }

    public static Biscoito[] transformaListEmArray (List k)
    {
        ArrayList lista = new ArrayList ();

        for (Object i : k)
        {
            if (i instanceof Biscoito)
                lista.add (i);
        }

        return (Biscoito[]) lista.toArray ();
    }

    public static void soma (Biscoito[] arr)
    {
        double total = 0;

        for (Biscoito i : arr)
            total += i.getPreco ();

        System.out.println ("A soma de todos os valores é: R$" + (new DecimalFormat ("#0.00")).format (total));
    }
}

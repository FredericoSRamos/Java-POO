package poo.provas.P1.Segundo2022;

import java.util.Scanner;
import java.util.ArrayList;

public class SistemaPrincipal {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        String id = sc.nextLine ();

        ArrayList lista = LerArquivo.retornaString ();

        ArrayList briofitasEPteridofitas = Utils.retornaDados(lista);

        Planta temp = new Planta (id);

        if (Utils.existe (briofitasEPteridofitas, temp))
            System.out.println (briofitasEPteridofitas.get(briofitasEPteridofitas.indexOf(temp)));

        else
            System.out.println ("A planta com ID " + id + " não existe.");

        sc.close ();
    }
}

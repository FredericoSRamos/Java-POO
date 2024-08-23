package poo.provas.P1.Primeiro2023;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaPeso {
    public static void main (String[] args)
    {
        List<String> lista = new ArrayList<String> ();

        Scanner sc = new Scanner (System.in);

        System.out.println ("Insira nome, peso e altura no formato: nome#peso#altura\nInsira finalizar para encerrar a inserção");

        for (int i = 0; i < 1000; i++)
        {
            String temp = sc.nextLine ();

            if (temp.equalsIgnoreCase ("finalizar"))
                break;

            lista.add (temp);
        }

        sc.close ();

        if (lista.size () == 0)
            return;

        double total = 0;

        for (String i : lista)
        {
            total += Double.parseDouble (i.split("#")[1]);
        }

        total /= lista.size ();

        System.out.println ("A média dos pesos é: " + total);
    }

    public static String inverter (String str)
    {
        char [] strToChar = str.toCharArray();
        char [] revert = new char [strToChar.length];

        for (int i = 0, j = strToChar.length - 1; j > -1; i++, j--)
            revert[i] = strToChar[j];

        return new String (revert);
    }
}

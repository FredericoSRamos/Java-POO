package poo.provas.P1.Segundo2018;

import java.util.Scanner;
import java.util.List;

import poo.provas.P1.Segundo2019.BancoDeDados;

public class Nomes 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        String nome = sc.nextLine ();

        List lista = BancoDeDados.getFunc ();

        boolean hasName = false;
        short idade = 0;
        double media = 0;

        for (Object i : lista)
        {
            if (((String) i).split("#")[0].equals (nome))
            {
                hasName = true;
                idade = Short.parseShort (((String) i).split("#")[1]);
            }

            media += (Double.parseDouble (((String) i).split("#")[1])) / lista.size ();
        }

        if (hasName)
            System.out.println (nome + " - idade: " + idade + " - Média da idade de todos os funcionários - " + media);

        else
            System.out.println ("Nome não encontrado");

        sc.close ();
    }
}
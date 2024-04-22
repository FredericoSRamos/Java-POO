package poo.provas.Segundo2019;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.List;

public class CalculoIMC {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        String nome = sc.nextLine ();

        List lista = BancoDeDados.getFunc();

        boolean hasNome = false;

        double imc = 0;

        for (Object x : lista)
        {
            String[] info = ((String) x).split ("#");

            if (info[0].equals(nome))
            {
                hasNome = true;

                imc = Double.parseDouble (info[1]) / (Math.pow (Double.parseDouble (info[2]), 2));

                break;
            }
        }

        if (hasNome)
        {
            double totalMaior = 0;
            double totalMedio = 0;
            
            for (Object x : lista)
            {
                String[] info = ((String) x).split ("#");

                double imcLocal = Double.parseDouble (info[1]) / (Math.pow (Double.parseDouble (info[2]), 2));

                totalMedio += imcLocal / lista.size ();

                if (imcLocal > imc)
                    totalMaior++;
            }

            double porcentagem = totalMaior / lista.size ();

            DecimalFormat formatter = new DecimalFormat ("#0.00");

            System.out.print (nome + " - " + formatter.format (imc).replace(",", ".") + " - " + formatter.format(totalMedio).replace(",", ".") + " - " + formatter.format(porcentagem).replace(",", "."));

            if (imc > 40)
                System.out.println ("ALERTA");
            else
                System.out.println ("");
        }
        else
            System.out.println ("Nome não encontrado");

        sc.close ();
    }
}

package poo.provas.P2.Primeiro2022;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SistemaPrincipal
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        String string = sc.next();

        try
        {
            Set<String> set = LerArquivo.retornaStrings(string);

            Map<String, CorpoCeleste> mapa = Utils.retornaDados(set);

            String[] dados = string.split("#");

            Estrela estrela = new Estrela (dados[0]);
            estrela.setNome (dados[1]);
            estrela.setDistancia (Double.parseDouble (dados[2]));

            if (Utils.existe(mapa.values(), estrela))
                System.out.println (mapa.get(dados[0]));
            else
                System.out.println ("A estrela com ID " + dados[0] + " não existe.");
        } catch (FormatoIncorretoException e)
        {
            System.out.println ("Há um problema no seu arquivo de texto. " + e);
        }

        sc.close();
    }
}

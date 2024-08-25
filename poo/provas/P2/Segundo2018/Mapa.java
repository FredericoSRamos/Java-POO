package poo.provas.P2.Segundo2018;

import java.util.Map;

public class Mapa
{
    public static double contaA (Map<String, Integer> mapa)
    {
        double soma = 0;

        for (Map.Entry<String,Integer> entry : mapa.entrySet())
        {
            if (entry.getKey().startsWith("A"))
                soma += entry.getValue();
        }

        return soma;
    }
}

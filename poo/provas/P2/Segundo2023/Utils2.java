package poo.provas.P2.Segundo2023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Utils2
{
    public static void imprimirCustos(List<Carro> lista)
    {
        double totalPreco = 0;
        double totalImposto = 0;

        for (Carro carro : lista)
        {
            List<Acessorio> acessorios = carro.getLista();

            for (Acessorio acessorio : acessorios)
            {
                totalPreco += acessorio.getPreco();
                totalImposto += acessorio.calcularImposto();
            }
        }

        System.out.println ("Total de preço: R$" + totalPreco + " | Total de impostos: R$" + totalImposto);
    }

    public static Map<String, Carro> transformaListaEmMapa (List<Carro> carros)
    {
        Map<String, Carro> mapa = new HashMap<>();

        Iterator<Carro> iterator = carros.iterator();

        while (iterator.hasNext())
        {
            Carro carro = iterator.next();

            mapa.put (carro.getPlaca(), carro);
        }

        return mapa;
    }
}

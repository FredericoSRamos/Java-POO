package poo.provas.P2.Segundo2016;

import java.util.List;
import java.util.Iterator;

public class BombaDeCombustivel
{
    private double qtd_combustivel_atual = 1000; // Valor qualquer, já que não foi especificado
    private double qtd_combustivel_utilizado;

    public void abastecerVeiculos (List<VeiculoAutomotor> veiculos)
    {
        Iterator<VeiculoAutomotor> iterator = veiculos.iterator();

        while (iterator.hasNext())
        {
            double qtd_para_abastecer = iterator.next().completarTanque(qtd_combustivel_atual);

            qtd_combustivel_atual -= qtd_para_abastecer;
            qtd_combustivel_utilizado += qtd_para_abastecer;
        }
    }

    public double getQtdeCombustivelUtilizado ()
    {
        return qtd_combustivel_utilizado;
    }
}

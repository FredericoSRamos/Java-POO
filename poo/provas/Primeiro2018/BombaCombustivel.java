package poo.provas.Primeiro2018;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class BombaCombustivel {
    private double precoLitro = 4.8;
    private double quantidadeLitros;

    public void setQuantidadeLitros (double quantidade)
    {
        this.quantidadeLitros = quantidade;
    }

    public double getQuantidadeLitros ()
    {
        return this.quantidadeLitros;
    }

    public void completarTanque (Abastecivel veiculo)
    {
        DecimalFormat formatter = new DecimalFormat ("#0.00");
        double total = 0;
        while (veiculo.abastecer(0.1))
        {
            total += 0.1;
            if (quantidadeLitros < 0.1)
            {
                System.out.println ("Valor: R$" + formatter.format (total * precoLitro));
                throw new IllegalArgumentException ("Acabou o combustível da bomba");
            }
        }
        System.out.println ("Total de litros: " + formatter.format (total) + "\nValor: R$" + formatter.format (total * precoLitro));
    }

    public void abastecerFila (ArrayList x)
    {
        for (Object i : x)
        {
            if (i instanceof Abastecivel)
            {
                System.out.println(i);
                completarTanque((Abastecivel) i);
            }
        }
    }
}

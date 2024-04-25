package poo.provas.Primeiro2018;

import java.util.ArrayList;

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
        double total = 0;
        while (veiculo.abastecer(0.1))
        {
            total += 0.1;
            if (quantidadeLitros < 0.1)
            {
                System.out.println ("Valor: R$" + total * precoLitro);
                throw new IllegalArgumentException ("Acabou o combustível da bomba");
            }
        }
        System.out.println ("Total de litros: " + total + "\nValor: R$" + total * precoLitro);
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

package poo.provas.P2.Segundo2016;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Principal
{
    public static void main (String[] args)
    {
        BombaDeCombustivel bomba = new BombaDeCombustivel();
        List<VeiculoAutomotor> veiculos = new ArrayList<>();

        veiculos.add (new Motocicleta ("XTR 125", 20, 5));
        veiculos.add (new Automovel ("Palio 1.6", 50, 32));
        veiculos.add (new Motocicleta ("CB 400", 25, 15));

        System.out.println ("Veículos NÃO ORDENADOS");
        System.out.println (veiculos);
        System.out.println ();

        bomba.abastecerVeiculos (veiculos);

        Collections.sort (veiculos);
        
        System.out.println ("Veículos ORDENADOS pela quantidade de combustível no tanque");
        System.out.println (veiculos);
        System.out.println ();

        System.out.println ("Total de combustível utilizado: " + bomba.getQtdeCombustivelUtilizado());
    }
}
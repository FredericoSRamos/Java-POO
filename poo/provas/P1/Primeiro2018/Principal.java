package poo.provas.P1.Primeiro2018;

import java.util.ArrayList;

public class Principal {
    public static void main (String[] args)
    {
        BombaCombustivel bomba = new BombaCombustivel ();

        bomba.setQuantidadeLitros (5000);

        Carro carro = new Carro ("ABC123", 1000);
        carro.setQuantidadeAtual (500);

        ArrayList arr = new ArrayList ();

        arr.add (new Carro ("1", 1000));
        arr.add (new Moto ("2", 1000));
        arr.add (new Moto ("3", 1000));

        bomba.abastecerFila(arr);

        bomba.completarTanque (carro);
    }
}

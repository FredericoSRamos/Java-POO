package poo.Exercícios;

import java.util.Scanner;

public class TestarCorretora {
    public static void main (String[] args)
    {
        Corretora corretora = new Corretora ();

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < 5; i++)
        {
            corretora.imoveis[i].setPreço(sc.nextDouble());
            corretora.imoveis[i].setEndereço(sc.next());
        }

        System.out.println (corretora.somaPreço());

        sc.close();
    }
}

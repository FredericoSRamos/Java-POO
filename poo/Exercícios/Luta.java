package poo.Exercícios;

import java.util.Scanner;

public class Luta {
    public static void main (String[] args)
    {
        Lutador[] lutadores = new PesoPena[10];
        lutadores[0] = new PesoPena ("Anderson Silva", 45, 84);
        lutadores[1] = new PesoPena ("Khabib", 31, 70);
        lutadores[2] = new PesoPena ("Thiago Santos", 36, 93);
        lutadores[3] = new PesoPena ("Jon Jones", 32, 93);
        lutadores[4] = new PesoPena ("Stipe Miocic", 37, 113.5);
        lutadores[5] = new PesoPena ("Max Holloway", 28, 66);
        lutadores[6] = new PesoPena ("Yoel Romero", 42, 84.5);
        lutadores[7] = new PesoPena ("Karl Marx", 38, 115.3);
        lutadores[8] = new PesoPena ("Chaparral", 42, 58.4);
        lutadores[9] = new PesoPena ("Cléber da Silva", 34, 59.8);

        Lutador escolhido = lutadores[(int) (Math.random() * 10)];

        System.out.println (escolhido + "\n");

        escolhido.possiveisLutas(lutadores);

        Lutador lutadorEscolhido;

        do lutadorEscolhido = escolhaLutador (lutadores);
        while (lutadorEscolhido == null);

        System.out.println ("\nLutador escolhido:\n\n" + lutadorEscolhido + "\n");
    }

    public static Lutador escolhaLutador (Lutador[] lutadores)
    {
        System.out.println ("\nDigite o nome do lutador escolhido para a luta:\n");

        Scanner sc = new Scanner (System.in);

        String nome = sc.nextLine();

        for (int i = 0; i < lutadores.length; i++)
        {
            if (nome.equalsIgnoreCase(lutadores[i].getNome()))
            {
                sc.close ();
                return lutadores[i];
            }
        }

        sc.close();
        return null;
    }
}

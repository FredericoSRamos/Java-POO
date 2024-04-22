package poo.Exercícios;

public class Corretora {
    Imovel[] imoveis = new Imovel[5];

    Corretora ()
    {
        for (int i = 0; i < 3; i++)
        {
            imoveis[i] = new Imovel ();
        }
        imoveis[3] = new Velho ();
        imoveis[4] = new Novo ();
    }

    public double somaPreço ()
    {
        double preçoTotal = 0;

        for (int i = 0; i < 5; i++)
        {
            preçoTotal += imoveis[i].getPreço();
        }

        return preçoTotal;
    }
}

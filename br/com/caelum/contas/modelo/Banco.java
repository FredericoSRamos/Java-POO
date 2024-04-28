package br.com.caelum.contas.modelo;

public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas;
    private static int posicao = 0;

    public Banco (String nome, int numero)
    {
        this.nome = nome;
        this.numero = numero;
        this.contas = new ContaCorrente[10];
    }

    public void adiciona (Conta c)
    {
        if (posicao >= contas.length)
        {
            Conta[] temp = new ContaCorrente[contas.length + 10];

            for (int i = 0; i < contas.length; i++)
            {
                temp[i] = contas[i];
            }

            contas = temp;
            //    throw new FullArrayException ();
        }

        contas[posicao] = c;
        posicao++;
    }

    public Conta[] getContas ()
    {
        return this.contas;
    }

    public void mostraContas ()
    {
        for (Conta i : contas)
        {
            if (i != null)
                System.out.println (i);
        }
    }

    public boolean contem (Conta conta)
    {
        for (Conta i : contas)
        {
            if (i.equals(conta))
                return true;
        }

        return false;
    }
}

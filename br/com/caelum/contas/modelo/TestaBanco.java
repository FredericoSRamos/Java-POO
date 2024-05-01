package br.com.caelum.contas.modelo;

public class TestaBanco {
    public static void main (String[] args)
    {
        Banco banco = new Banco ("CaelumBank", 999);

        for	(int i = 0; i < 15; i++)
        {
			ContaCorrente conta = new ContaCorrente ();

			conta.setTitular ("Titular " + i);
			conta.setNumero (i + 1);
			conta.setAgencia ("1000");
			conta.depositar ((i + 1) * 1000);
            
			banco.adiciona (conta);
        }

        //banco.mostraContas();
    }
}

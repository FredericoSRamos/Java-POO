package br.com.caelum.contas.modelo;

public class TestaTributavel {
    public static void main (String[] args)
    {
        ContaCorrente cc = new ContaCorrente ();
		cc.depositar (100);
		System.out.println (cc.getValorImposto ());

		Tributavel t = cc;
		System.out.println (t.getValorImposto ());
    }
}

package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel
{
    private double taxa = 0.1;

    public double getValorImposto ()
    {
        return this.saldo * 0.01;
    }

    public double calculaRendimento ()
    {
        return this.saldo * 0.1;
    }

    @Override
    public void sacar (double quantiaSaque)
    {
        try
        {
            super.sacar (quantiaSaque + taxa);
        } catch (SaldoInsuficienteException | IllegalArgumentException e)
        {
            System.out.println (e.getMessage ());
            e.printStackTrace ();
        }
    }

}

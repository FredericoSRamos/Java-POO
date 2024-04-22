package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel 
{
    protected double valor;
    protected String titular;
    protected int numeroApolice;

    public String getTipo ()
    {
        return "Seguro de Vida";
    }

    public double getValorImposto ()
    {
        return 42 + 0.02 * valor;
    }

    public void setValor (double valor)
    {
        this.valor = valor;
    }

    public double getValor ()
    {
        return this.valor;
    }

    public void setTitular (String titular)
    {
        this.titular = titular;
    }

    public String getTitular ()
    {
        return this.titular;
    }

    public void setNumeroApolice (int apolice)
    {
        this.numeroApolice = apolice;
    }

    public int getNumeroApolice ()
    {
        return this.numeroApolice;
    }
}

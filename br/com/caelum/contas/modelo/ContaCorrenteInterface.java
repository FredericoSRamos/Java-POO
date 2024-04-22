package br.com.caelum.contas.modelo;

public class ContaCorrenteInterface implements ContaInterface
{
    protected double saldo;
    protected double TaxaSelic;

    public double getSaldo ()
    {
        return this.saldo;
    }

    public void deposita (double valor)
    {
        if (valor <= 0)
            throw new IllegalArgumentException ("Valor inválido");

        this.saldo += valor;
    }

    public void saca (double valor)
    {
        if (valor > this.saldo)
            throw new IllegalArgumentException ("Valor invalido");

        this.saldo -= valor;
    }

    public void atualiza (double TaxaSelic)
    {
        this.TaxaSelic = TaxaSelic;
    }
}

package br.com.caelum.contas.modelo;

public class ContaPoupança extends Conta
{
    public double calculaRendimento ()
    {
        return this.saldo * 0.2;
    }
}

package br.com.caelum.contas.modelo;

public interface ContaInterface
{
    public double getSaldo ();
    public void deposita (double valor);
    public void saca (double valor);
    public void atualiza (double TaxaSelic);
}
package br.com.caelum.contas.modelo;

public class Conta implements Comparable<Conta>
{
    protected String titular;
    protected int numero;
    protected double saldo;
    protected Data abertura = new Data();
    protected static int identificador;
    protected String agencia;

    @Override
    public String toString ()
    {
        return "[titular = " + this.titular.toUpperCase() + ", numero = " + this.numero + ", agencia = " + this.agencia	+ "]";
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj == null)
            return false;

        if (!(obj instanceof Conta))
            return false;

        return (((Conta) obj).getNumero() == this.numero && ((Conta) obj).getAgencia().equals(this.agencia));
    }

    public int compareTo (Conta outraConta)
    {
        return this.titular.compareTo (outraConta.titular);
    }

    public void setAgencia (String agencia)
    {
        this.agencia = agencia;
    }

    public String getAgencia ()
    {
        return this.agencia;
    }

    public void setTitular (String titular)
    {
        this.titular = titular;
    }

    public void transfere (Conta conta, double valor)
    {
        if (conta.equals(this))
        {
            System.out.println("Insira uma conta de destino válida");
            return;
        }

        if (conta.getTipo().equals(this.getTipo()))
        {
            try
            {
                this.sacar(valor);
            } catch (SaldoInsuficienteException | IllegalArgumentException e)
            {
                System.out.println (e.getMessage ());
                e.printStackTrace ();
            }

            conta.depositar(valor);
            System.out.println ("Tranferência de R$" + valor + " realizada com sucesso");
        }
        else
            System.out.println ("Não é possível realizar transferências entre contas de tipos diferentes");
    }

    public String getTipo ()
    {
        String temp = this.getClass().toString().split("[.]")[5];
        return temp.substring (0, 5) + " " + temp.substring (5);
    }

    public String getTitular ()
    {
        return this.titular;
    }

    public void depositar (double quantiaDeposito)
    {
        if (quantiaDeposito < 0)
            throw new IllegalArgumentException ("Quantia inválida");

        this.saldo += quantiaDeposito;
    }

    public void sacar (double quantiaSaque)
    {
        if (quantiaSaque < 0)
            throw new IllegalArgumentException ("Quantia inválida");

        if (quantiaSaque > saldo)
            throw new SaldoInsuficienteException (quantiaSaque);

        this.saldo -= quantiaSaque;
    }

    public void setNumero (int numero)
    {
        this.numero = numero;
    }

    public int getNumero ()
    {
        return this.numero;
    }

    public boolean setData (int dia, int mes, int ano)
    {
        return (this.abertura.setData (dia, mes, ano));
    }

    public String getData ()
    {
        return (this.abertura.getData ());
    }

    public double getSaldo ()
    {
        return (this.saldo);
    }

    public double calculaRendimento ()
    {
        return saldo * 0.1;
    }

    public String recuperaDadosParaImpressao ()
    {
        return "Nome do Titular: " + titular + "\nNúmero: " + numero + "\nData de abertura: " + abertura.getData() + "\nSaldo: $" + saldo + "\nIdentificador: " + Conta.identificador;
    }

    public int getIdentificador ()
    {
        return Conta.identificador;
    }
}

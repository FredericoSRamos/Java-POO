package poo.Exercícios;

public class ContaBancaria {
    private double saldo;
    private Data dataAbertura = new Data();

    public void setSaldo (double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo ()
    {
        return this.saldo;
    }

    public void setDataAbertura (int dia, int mes, int ano)
    {
        this.dataAbertura.setDia(dia);
        this.dataAbertura.setMes(mes);
        this.dataAbertura.setAno(ano);
    }

    public String getDataAbertura ()
    {
        return getDataAberturaFormatada();
    }

    public String getDataAberturaFormatada ()
    {
        String temp = "";

        if (this.dataAbertura.getDia () < 10)
            temp += "0";

        temp += this.dataAbertura.getDia () + "/";

        if (this.dataAbertura.getMes () < 10)
            temp += "0";

        return temp + this.dataAbertura.getMes () + "/" + this.dataAbertura.getAno();
    }

    public String getSaldoFormatado ()
    {
        String[] test = Double.toString(this.getSaldo()).split("[.]");

        char[] temp = test[0].toCharArray();

        int size = test[0].length();

        int invertSize = size / 3;
        if (size % 3 == 0)
            invertSize--;

        char[] tempInverte = new char[size + invertSize];

        for (int i = size - 1, j = 0; i > -1; i--, j++)
        {
            if ((j + 1) % 4 == 0 && j > 0)
            {
                tempInverte[j] = '.';
                j++;
            }
            tempInverte[j] = temp[i];
        }

        for (int i = 0, j = tempInverte.length - 1; i < j; i++, j--)
        {
            char tempChar = tempInverte[i];
            tempInverte[i] = tempInverte[j];
            tempInverte[j] = tempChar;
        }

        if (test[1].length() == 1)
            return "R$ " + new String (tempInverte) + ',' + test[1] + '0';
        else
            return "R$ " + new String (tempInverte) + ',' + test[1];
    }

    public void depositar (double valor)
    {
        if (valor < 0)
            throw new IllegalArgumentException ("Valor inválido");

        this.saldo += valor;
    }

    public void sacar (double valor)
    {
        if (valor > this.getSaldo())
            throw new IllegalArgumentException ("Valor insuficiente");

        this.saldo -= valor;
    }
}

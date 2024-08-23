package poo.provas.P1.Primeiro2019;

import java.text.DecimalFormat;

public class Produto {
    String id;
    String cor;
    double preco;

    Produto (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj == null)
            return false;

        if (!(obj instanceof Produto))
            return false;

        return ((Produto) obj).getId().equals(this.getId());
    }

    @Override
    public String toString ()
    {
        return id + " - " + cor + " - " + (new DecimalFormat ("#0.00")).format (preco);
    }

    public void setCor (String cor)
    {
        this.cor = cor;
    }

    public String getCor ()
    {
        return this.cor;
    }

    public void setPreco (double preco)
    {
        this.preco = preco;
    }

    public double getPreco ()
    {
        return this.preco;
    }

    public String getId ()
    {
        return this.id;
    }
}

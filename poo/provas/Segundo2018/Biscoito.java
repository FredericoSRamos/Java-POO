package poo.provas.Segundo2018;

public class Biscoito 
{
    String id;
    String cor;
    double preco;

    Biscoito (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj == null)
            return false;

        if (!(obj instanceof Biscoito))
            return false;

        return ((Biscoito) obj).getId().equals (this.getId ());
    }

    @Override
    public String toString ()
    {
        return "Id: " + this.id + "\nCor: " + this.cor + "\nPreço: " + this.preco;
    }

    public String getId ()
    {
        return this.id;
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
}

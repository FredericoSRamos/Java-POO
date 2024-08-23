package poo.provas.P1.Primeiro2023;

public class Biscoito 
{
    private String id;
    private String cor;
    private double preco;

    Biscoito (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object object)
    {
        if (object == null)
            return false;

        if (!(object instanceof Biscoito))
            return false;

        return (((Biscoito) object)).getId().equals(this.getId());
    }

    @Override
    public String toString ()
    {
        return "Id: " + this.id + "\nCor: " + this.cor + "\nPreço: " + this.preco;
    }

    public void setPreco (double preco)
    {
        this.preco = preco;
    }

    public double getPreco ()
    {
        return this.preco;
    }

    public void setCor (String cor)
    {
        this.cor = cor;
    }

    public String getCor ()
    {
        return this.cor;
    }

    public String getId ()
    {
        return this.id;
    }
}

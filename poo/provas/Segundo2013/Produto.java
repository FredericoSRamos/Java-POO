package poo.provas.Segundo2013;

public class Produto
{
    private String id;
    private String cor;
    private double preco;
    
    Produto (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object object)
    {
        if (object == null)
            return false;

        if (!(object instanceof Produto))
            return false;

        return (((Produto) object).id.equals (this.id));
    }

    @Override
    public String toString ()
    {
        return "ID: " + this.id + "\nCor: " + this.cor + "\nPreço: R$" + this.preco;
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

    public double getPreco ()
    {
        return this.preco;
    }

    public void setPreco (double preco)
    {
        this.preco = preco;
    }
}

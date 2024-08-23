package poo.provas.P1.Segundo2016;

public abstract class Produto
{
    private double preco;
    private int id;

    Produto (double preco, int id)
    {
        this.preco = preco;
        this.id = id;
    }

    @Override
    public String toString ()
    {
        return this.getClass().toString().split("[.]")[3];
    }

    public double getPreco ()
    {
        return this.preco;
    }

    public int getId ()
    {
        return this.id;
    }
}

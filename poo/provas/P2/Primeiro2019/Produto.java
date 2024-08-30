package poo.provas.P2.Primeiro2019;

public class Produto
{
    private String id;
    private String cor;
    private double preco;

    public Produto (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + " | Cor: " + cor + " | Preço: " + preco;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (!(obj instanceof Produto))
            return false;

        return id.equals(((Produto) obj).getID());
    }

    public String getID()
    {
        return this.id;
    }
}

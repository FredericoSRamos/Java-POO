package poo.provas.P2.Segundo2023;

public abstract class Acessorio
{
    private String marca;
    private double preco;

    public Acessorio (String marca, double preco)
    {
        this.marca = marca;
        this.preco = preco;
    }

    public abstract double calcularImposto();

    public double getPreco()
    {
        return this.preco;
    }

    public String getMarca()
    {
        return this.marca;
    }
}

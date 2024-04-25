package poo.provas.Segundo2016;

public class Liquidificador extends Produto implements Ligavel
{
    private String marca;

    Liquidificador (double preco, int id)
    {
        super (preco, id);
    }

    public void ligar ()
    {
        System.out.println ("Liquidificador ligando");
    }

    public void setMarca (String marca)
    {
        this.marca = marca;
    }

    public String getMarca ()
    {
        return this.marca;
    }
}

package poo.provas.P1.Segundo2016;

public class Chocolate extends Produto implements Comestivel
{
    private String tipo;

    Chocolate (double preco, int id)
    {
        super (preco, id);
    }

    public void desembalar ()
    {
        System.out.println ("Chocolate sendo desembalado");
    }

    public void setTipo (String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo ()
    {
        return this.tipo;
    }
}

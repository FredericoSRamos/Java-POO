package poo.provas.P1.Segundo2016;

public class Carro extends Brinquedo implements Ligavel
{
    private String placa;

    Carro (double preco, int id)
    {
        super (preco, id);
    }

    public void ligar ()
    {
        System.out.println ("Carro ligando");
    }

    public void setPlaca (String placa)
    {
        this.placa = placa;
    }

    public String getPlaca ()
    {
        return this.placa;
    }
}

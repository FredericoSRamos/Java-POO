package poo.provas.P1.Primeiro2018;

public abstract class Veiculo
{
    private String modelo;

    Veiculo (String modelo)
    {
        this.modelo = modelo;
    }

    @Override
    public String toString ()
    {
        return this.modelo;
    }

    public void setModelo (String modelo)
    {
        this.modelo = modelo;
    }

    public String getModelo ()
    {
        return this.modelo;
    }
}
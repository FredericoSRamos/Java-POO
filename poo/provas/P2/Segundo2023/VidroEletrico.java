package poo.provas.P2.Segundo2023;

public class VidroEletrico extends Acessorio
{
    public VidroEletrico (String marca, double preco)
    {
        super (marca, preco);
    }

    @Override
    public double calcularImposto()
    {
        return this.getPreco() * 0.2;
    }
}

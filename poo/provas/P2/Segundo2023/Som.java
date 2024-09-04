package poo.provas.P2.Segundo2023;

public class Som extends Acessorio
{
    public Som (String marca, double preco)
    {
        super (marca, preco);
    }

    @Override
    public double calcularImposto()
    {
        return this.getPreco() * 0.3;
    }
}

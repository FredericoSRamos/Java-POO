package poo.provas.Primeiro2018;

public class Moto extends Veiculo implements Abastecivel
{
    private final double tamanhoTanque;
    private double quantidadeAtual;

    Moto (String modelo, double tamanhoTanque)
    {
        super (modelo);
        this.tamanhoTanque = tamanhoTanque;
    }

    public boolean abastecer (double litros)
    {
        if (((tamanhoTanque * 0.99) - quantidadeAtual) < litros)
            return false;

        quantidadeAtual += litros;

        return true;
    }

    public void setQuantidadeAtual (double quantidade)
    {
        this.quantidadeAtual = quantidade;
    }

    public double getQuantidadeAtual ()
    {
        return this.quantidadeAtual;
    }
}

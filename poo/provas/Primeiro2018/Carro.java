package poo.provas.Primeiro2018;

public class Carro extends Veiculo implements Abastecivel
{
    private final double tamanhoTanque;
    private double quantidadeAtual;

    Carro (String modelo, double tamanhoTanque)
    {
        super (modelo);
        this.tamanhoTanque = tamanhoTanque;
    }

    public boolean abastecer (double litros)
    {
        if ((tamanhoTanque - quantidadeAtual) < litros)
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

package poo.provas.P2.Segundo2016;

public final class Motocicleta extends VeiculoAutomotor
{
    public Motocicleta (String modelo, double capacidade_tanque, double qtd_combustivel_atual)
    {
        super (modelo, capacidade_tanque, qtd_combustivel_atual);
    }

    @Override
    public String toString()
    {
        return "Motocicleta " + super.toString();
    }

    @Override
    public double completarTanque (double qtd_combustivel_bomba)
    {
        double qtd_faltante = 0.9 * capacidade_tanque - qtd_combustivel_atual;

        if (qtd_combustivel_bomba < qtd_faltante)
            return 0;

        qtd_combustivel_atual = 0.9 * capacidade_tanque;

        return qtd_faltante;
    }
}

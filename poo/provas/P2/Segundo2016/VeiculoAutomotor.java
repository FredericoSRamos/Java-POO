package poo.provas.P2.Segundo2016;

public abstract class VeiculoAutomotor implements Comparable<VeiculoAutomotor>
{
    public String modelo;
    public double capacidade_tanque;
    public double qtd_combustivel_atual;

    public VeiculoAutomotor (String modelo, double capacidade_tanque, double qtd_combustivel_atual)
    {
        this.modelo = modelo;
        this.capacidade_tanque = capacidade_tanque;
        this.qtd_combustivel_atual = qtd_combustivel_atual;
    }

    @Override
    public String toString()
    {
        return this.modelo + " com " + this.qtd_combustivel_atual + " litros no tanque";
    }

    public int compareTo (VeiculoAutomotor veiculo_para_comparar)
    {
        if (this.qtd_combustivel_atual < veiculo_para_comparar.qtd_combustivel_atual)
            return -1;
        else if (this.qtd_combustivel_atual > veiculo_para_comparar.qtd_combustivel_atual)
            return 1;

        return 0;
    }

    public double completarTanque (double qtd_combustivel_bomba)
    {
        double qtd_faltante = capacidade_tanque - qtd_combustivel_atual;

        if (qtd_combustivel_bomba < qtd_faltante)
            return 0;

        qtd_combustivel_atual = capacidade_tanque;

        return qtd_faltante;
    }
}
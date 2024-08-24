package poo.provas.P2.Segundo2016;

public class Automovel extends VeiculoAutomotor
{
    public Automovel (String modelo, double capacidade_tanque, double qtd_combustivel_atual)
    {
        super (modelo, capacidade_tanque, qtd_combustivel_atual);
    }

    @Override
    public String toString()
    {
        return "Automóvel " + super.toString();
    }
}
